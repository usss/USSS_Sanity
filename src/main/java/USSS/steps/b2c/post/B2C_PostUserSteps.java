package USSS.steps.b2c.post;

import USSS.Utils.DataBaseUtils;
import USSS.Utils.ReadConfiguration;
import USSS.pages.Exceptions.ChangeTariffException;
import USSS.pages.Exceptions.IncorrectListTariffsException;
import USSS.pages.Exceptions.NoFutureTariffException;
import USSS.pages.b2c.post.TariffsListB2CPostPage;
import USSS.steps.b2c.GeneralB2CSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class B2C_PostUserSteps extends GeneralB2CSteps {
    public B2C_PostUserSteps(Pages pages) {super(pages); }

    @Step
    public void change_tariff(String tariffName){
        TariffsListB2CPostPage tariffsListPage = getPages().get(TariffsListB2CPostPage.class);
        tariffsListPage.changeTariff(tariffName);
    }
    @Step
    public void change_tariff(){
        TariffsListB2CPostPage tariffsListPage = getPages().get(TariffsListB2CPostPage.class);
        List<String> listTariffs = tariffsListPage.getListTariffs();
        Random rand = new Random();
        String tariffName = listTariffs.get(rand.nextInt(listTariffs.size()));
        tariffsListPage.changeTariff(tariffName);
    }
    @Step
    public void check_tariff_change(String tariffName){
        open_tariff_list();
        TariffsListB2CPostPage tariffsListPage = getPages().get(TariffsListB2CPostPage.class);
        String futureTariffName = tariffsListPage.getFutureTariffName();
        if(!futureTariffName.trim().equals(tariffName.trim()))
            throw new ChangeTariffException("Ошибка смены тарифа [" + futureTariffName + "] на тариф [" + tariffName + "]");
    }
    @Step
    public void check_display_tariffs() throws IOException, SQLException, ClassNotFoundException {
        TariffsListB2CPostPage tariffsListPage = getPages().get(TariffsListB2CPostPage.class);
        List<String> listTariffs = tariffsListPage.getListTariffs();
        ReadConfiguration conf = new ReadConfiguration("BSSDB.properties");
        DataBaseUtils db = new DataBaseUtils(conf.getDataBase(), conf.getHost(), conf.getPort(),conf.getUserName(), conf.getUserPass());
        String query = "select entity_name from web_entity where ext_entity_code in(" +
                "select trim(s.soc)" +
                "  from soc@RUS35 s" +
                "   left join market_soc_restrict@RUS35 msr" +
                "       on (s.market_restrict_ind = 'Y' " +
                "    and s.soc = msr.soc " +
                "    and NVL(TO_CHAR(msr.EXPIRATION_DATE,'YYYYMMDD'),'47001231')>=SOME(select TO_CHAR(logical_date,'yyyymmdd') from logical_date@RUS35 where logical_date_type='O')" +
                "    and to_char(msr.effective_date,'YYYYMMDD')<=SOME(select TO_CHAR(logical_date,'yyyymmdd') from logical_date@RUS35 where logical_date_type='O'))" +
                "   join soc_acc_restriction@RUS35 sar" +
                "       on (s.soc=sar.soc" +
                "    and sar.account_types=SOME(select account_type from ecr9_billing_account where ban in (select customer_id from ecr9_subscriber where subscriber_no='9030339830')))" +
                "   join product_soc_restriction@RUS35 psr" +
                "       on (s.soc=psr.soc" +
                "    and psr.product_code='GVOI'" +
                "    and NVL(TO_CHAR(psr.EXPIRATION_DATE,'YYYYMMDD'),'47001231')>=SOME(select TO_CHAR(logical_date,'yyyymmdd') from logical_date@RUS35 where logical_date_type='O')" +
                "    and to_char(psr.effective_date,'YYYYMMDD')<=SOME(select TO_CHAR(logical_date,'yyyymmdd') from logical_date@RUS35 where logical_date_type='O'))" +
                "  join price_plan pp on pp.external_price_plan = s.soc" +
                "  join ecr9_price_plan_ext epp on pp.price_plan_id=epp.price_plan_id" +
                " where service_type='P' " +
                "  and soc_status='A'" +
                "  and NVL(TO_CHAR(TRUNC(s.EXPIRATION_DATE),'YYYYMMDD'),'47001231')>=SOME(select TO_CHAR(logical_date,'yyyymmdd') from logical_date@RUS35 where logical_date_type='O')" +
                "  and to_char(s.effective_date,'YYYYMMDD')<=SOME(select TO_CHAR(logical_date,'yyyymmdd') from logical_date@RUS35 where logical_date_type='O')" +
                "  and (s.market_restrict_ind IS NULL or s.market_restrict_ind ='N' or msr.market_code='VIP')" +
                "  and NVL(TO_CHAR(TRUNC(s.sale_exp_date),'YYYYMMDD'),'47001231')>=SOME(select TO_CHAR(logical_date,'yyyymmdd') from logical_date@RUS35 where logical_date_type='O')" +
                "  and to_char(s.sale_eff_date,'YYYYMMDD')<=SOME(select TO_CHAR(logical_date,'yyyymmdd') from logical_date@RUS35 where logical_date_type='O') " +
                "  and ADD_IND='Y'" +
                "  and ub_pp_type = 'C'" +
                "  and ((select * from (select public_ind from ecr9_billing_account_ext where ban in(select customer_id from ecr9_subscriber where subscriber_no='9030339830')) where public_ind = 'A')is null  or" +
                "  non_public_ind='N')" +
                "  ) group by entity_name";
        ArrayList<Map<String, String>> expectedListMapTariffs = db.ExecuteQuery(query, "entity_name");
        db.close();
        Collections.sort(listTariffs);
        List<String> expectedListTariffs = new ArrayList<String>();
        for (Map<String, String> map : expectedListMapTariffs) {
            expectedListTariffs.add(map.get("entity_name"));
        }
        Collections.sort(expectedListTariffs);

        if(expectedListTariffs.size() != listTariffs.size()){
            throw new IncorrectListTariffsException("Ожидаемое количество тарифов = " + expectedListTariffs.size() + " текущее количество тарифов = " + listTariffs.size() +  " запрос к БД [" + query + "]");
        }
        for(int i = 0; i < expectedListTariffs.size(); i++){
            if (!expectedListTariffs.get(i).trim().equals(listTariffs.get(i).trim()))
                throw new IncorrectListTariffsException("Несоответствие тарифов! Ожидаемый [" + expectedListTariffs.get(i).trim() + "] " + " текущий [" + listTariffs.get(i).trim() + "]" +  " запрос к БД [" + query + "]");
        }

    }
    @Step
    public void cancel_future_tariff(){
        TariffsListB2CPostPage tariffsListPage = getPages().get(TariffsListB2CPostPage.class);
        tariffsListPage.cancelFutureTariff();
    }
    @Step
    public void check_cancel_future_tariff(){
        TariffsListB2CPostPage tariffsListPage = getPages().get(TariffsListB2CPostPage.class);
        try {
            tariffsListPage.getFutureTariffName();
            throw new IncorrectListTariffsException("Будущий тарифный план не отменен!");
        }catch (NoFutureTariffException ignore){
            //NOP
        }
    }
    @Step
    public void check_disable_buttons_change_tariff(){
        TariffsListB2CPostPage tariffsListPage = getPages().get(TariffsListB2CPostPage.class);
        List<String> listTariffs = tariffsListPage.getListTariffs();
        for (String tariff : listTariffs){
            if (tariffsListPage.checkEnabledButtonChangeTariff(tariff)){
                throw new ChangeTariffException("Кнопка перехода на тариф " + tariff + " доступна!");
            }
        }
    }
    @StepGroup
    public void change_tariff_and_check_change(String login, String password, String tariffName) throws SQLException, IOException, ClassNotFoundException, InterruptedException {
        change_tariff(tariffName);
        e2e_null_transaction();
        logout();
        Thread.sleep(60000); //т.к. тариф не успевает смениться
        authorization(login, password);
        check_tariff_change(tariffName);
    }
    @StepGroup
    public void change_tariff_and_check_change(String login, String password) throws SQLException, IOException, ClassNotFoundException, InterruptedException {

        TariffsListB2CPostPage tariffsListPage = getPages().get(TariffsListB2CPostPage.class);
        List<String> listTariffs = tariffsListPage.getListTariffs();
        Random rand = new Random();
        String tariffName = listTariffs.get(rand.nextInt(listTariffs.size()));

        change_tariff(tariffName);
        e2e_null_transaction();
        logout();
        Thread.sleep(60000); //т.к. тариф не успевает смениться
        authorization(login, password);
        check_tariff_change(tariffName);
    }

}
