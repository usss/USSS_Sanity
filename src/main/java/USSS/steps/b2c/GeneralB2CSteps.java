package USSS.steps.b2c;

import USSS.pages.Exceptions.ConnectionSOCsException;
import USSS.pages.Exceptions.DisplaySOCsException;
import USSS.pages.b2c.LoginB2CPage;
import USSS.pages.b2c.ProfileB2CPage;
import USSS.pages.b2c.RequestHistoryPage;
import USSS.pages.b2c.TariffsListB2CPage;
import USSS.pages.b2c.prep.SOCListB2CPrepPage;
import USSS.steps.GeneralSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import org.junit.Assert;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GeneralB2CSteps extends GeneralSteps {
    public GeneralB2CSteps(Pages pages) {super(pages); }

    @Step
    public void authorization(String login, String password){
        LoginB2CPage loginPage = getPages().get(LoginB2CPage.class);
        loginPage.open();
        loginPage.authorization(login, password);
    }
    @Step
    public void logout(){
        TariffsListB2CPage tariffsListPage = getPages().get(TariffsListB2CPage.class);
        tariffsListPage.headerMenu.logOut();
    }
    @Step
    public void open_tariff_list(){
        ProfileB2CPage profilePage = getPages().get(ProfileB2CPage.class);
        profilePage.openTariffs();
    }
    @Step
    public void open_socs_list(){
        ProfileB2CPage profilePage = getPages().get(ProfileB2CPage.class);
        profilePage.openSOCs();
    }
    @Step
    public void open_request_history(){
        ProfileB2CPage profilePage = getPages().get(ProfileB2CPage.class);
        profilePage.openRequestHistory();
    }
    @Step
    public void open_finance_and_detail(){
        ProfileB2CPage profilePage = getPages().get(ProfileB2CPage.class);
        profilePage.openFinanceAndDetail();
    }
    @Step
    public void set_filter_all_SOCs(){
        SOCListB2CPrepPage socListB2CPrepPage = getPages().get(SOCListB2CPrepPage.class);
        socListB2CPrepPage.filterSOCs.openAllSOCs();
    }
    @Step
    public void set_filter_connected_SOCs(){
        SOCListB2CPrepPage socListB2CPrepPage = getPages().get(SOCListB2CPrepPage.class);
        socListB2CPrepPage.filterSOCs.openConnectedSOCs();
    }
    @Step
    public void set_filter_available_SOCs(){
        SOCListB2CPrepPage socListB2CPrepPage = getPages().get(SOCListB2CPrepPage.class);
        socListB2CPrepPage.filterSOCs.openAvailableSOCs();
    }

    @Step
    public void select_cats(String... cats){
        SOCListB2CPrepPage socListB2CPrepPage = getPages().get(SOCListB2CPrepPage.class);
        socListB2CPrepPage.selectCats(cats);
    }
    @Step
    public void unSelect_cats(String... cats){
        SOCListB2CPrepPage socListB2CPrepPage = getPages().get(SOCListB2CPrepPage.class);
        socListB2CPrepPage.unSelectCats(cats);
    }

    @Step
    public void select_random_cats_and_check_display_SOCs() {
        SOCListB2CPrepPage socListB2CPrepPage = getPages().get(SOCListB2CPrepPage.class);
        List<String> listCats = socListB2CPrepPage.getListCats();
        Random rand = new Random();
        int countCats = rand.nextInt(listCats.size());
        if (countCats==listCats.size())
            countCats--;
        for (;countCats > 0; countCats--)
            listCats.remove(rand.nextInt(listCats.size() - 1));
        String[] cats = new String[listCats.size()];
        listCats.toArray(cats);
        socListB2CPrepPage.selectCats(cats);
        List<String> socs = socListB2CPrepPage.getListSOCs();
        for (String soc : socs){
            String catInSoc = socListB2CPrepPage.getCategoriesForSOC(soc);
            if(listCats.indexOf(catInSoc) == -1)
                throw new DisplaySOCsException("Услуга [" + soc + "] с категорией [" + catInSoc + "] не удовлетворяет фильтру! Список категорий фильтра - " + Arrays.toString(listCats.toArray()));
        }
    }

    @Step
    public void enable_soc(String soc){
        SOCListB2CPrepPage socListB2CPrepPage = getPages().get(SOCListB2CPrepPage.class);
        socListB2CPrepPage.enableSoc(soc);
    }
    @Step
    public void disable_soc(String soc){
        SOCListB2CPrepPage socListB2CPrepPage = getPages().get(SOCListB2CPrepPage.class);
        socListB2CPrepPage.disableSoc(soc);
    }

    @Step
    public void check_enable_or_disable_soc_in_history_request(String soc){
        String expectedStatus = "Обработан";
        RequestHistoryPage requestHistoryPage = getPages().get(RequestHistoryPage.class);
        String actualStatus = requestHistoryPage.getLastRequest().getStatus();
        Assert.assertEquals("Заявка для услуги [" + soc + "] отклонена!", expectedStatus, actualStatus);
    }
    @Step
    public void check_absence_soc_in_list(String soc){
        SOCListB2CPrepPage socListB2CPrepPage = getPages().get(SOCListB2CPrepPage.class);
        List<String> socs = socListB2CPrepPage.getListSOCs();
        for (String socOfList: socs){
            if(soc.equals(socOfList)){
                throw new ConnectionSOCsException("Услуга [" + soc + "] отключена, но отображается в списке подключенных!");
            }
        }
    }

    @StepGroup
    public void enable_random_soc_and_check_enable(String login, String password) throws SQLException, IOException, ClassNotFoundException {
        SOCListB2CPrepPage socListB2CPrepPage = getPages().get(SOCListB2CPrepPage.class);
        List<String> socs = socListB2CPrepPage.getListSOCs();
        Random rand = new Random();
        String soc = socs.get(rand.nextInt(socs.size()));
        enable_soc(soc);
        logout();
        e2e_null_transaction();
        authorization(login, password);
        open_request_history();
        check_enable_or_disable_soc_in_history_request(soc);
    }
    @StepGroup
    public void disable_random_soc_and_check_disable(String login, String password) throws SQLException, IOException, ClassNotFoundException {
        SOCListB2CPrepPage socListB2CPrepPage = getPages().get(SOCListB2CPrepPage.class);
        List<String> socs = socListB2CPrepPage.getListSOCsSwitchTrue();
        Random rand = new Random();

        String soc = socs.get(rand.nextInt(socs.size()));
        disable_soc(soc);
        logout();
        e2e_null_transaction();
        authorization(login, password);
        open_request_history();
        check_enable_or_disable_soc_in_history_request(soc);
        open_socs_list();
        set_filter_connected_SOCs();
        check_absence_soc_in_list(soc);
    }

}
