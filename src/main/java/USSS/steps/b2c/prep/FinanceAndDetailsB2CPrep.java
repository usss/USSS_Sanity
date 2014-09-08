package USSS.steps.b2c.prep;

import USSS.pages.Exceptions.DisplayTablePaymentsException;
import USSS.pages.Exceptions.FinanceAndDetailsException;
import USSS.pages.b2c.prep.FinanceAndDetailB2CPrepPage;
import USSS.pages.b2c.ProfileB2CPage;
import USSS.steps.b2c.GeneralB2CSteps;
import com.sun.xml.internal.ws.wsdl.DispatchException;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static ch.lambdaj.Lambda.extract;
import static ch.lambdaj.Lambda.on;

public class FinanceAndDetailsB2CPrep extends GeneralB2CSteps {
    public FinanceAndDetailsB2CPrep(Pages pages) {
        super(pages);
    }

    @Step
    public void open_finance_and_details_page_and_check_page(){
        ProfileB2CPage profilePage = getPages().get(ProfileB2CPage.class);
        profilePage.openFinanceAndDetail();
        FinanceAndDetailB2CPrepPage financeAndDetail = getPages().get(FinanceAndDetailB2CPrepPage.class);
        financeAndDetail.checkDisplayFinanceAndDetailPage();
    }
    @Step
    public void select_period_for_today(){
        FinanceAndDetailB2CPrepPage financeAndDetail = getPages().get(FinanceAndDetailB2CPrepPage.class);
        financeAndDetail.selectPeriod("За сегодня");
    }
    @Step
    public void select_period_for_last_week(){
        FinanceAndDetailB2CPrepPage financeAndDetail = getPages().get(FinanceAndDetailB2CPrepPage.class);
        financeAndDetail.selectPeriod("За последнюю неделю");
    }
    @Step
    public void check_display_options_of_filter_by_type_payments() {
        FinanceAndDetailB2CPrepPage financeAndDetail = getPages().get(FinanceAndDetailB2CPrepPage.class);
        List<String> options = new ArrayList<String>();
        options.add("Все типы платежей");
        options.add("Платеж");
        options.add("Мобильный перевод");
        options.add("Активация карты ЕКО на другого абонента");
        options.add("Перенос платежа");
        Collections.sort(options);

        List<String> typePaymentsOptions = financeAndDetail.getOptionsFilterTypePayments();
        Collections.sort(typePaymentsOptions);
        if(typePaymentsOptions.size() != options.size())
            throw new FinanceAndDetailsException("Некорректное отображение фильтра! Должно быть - " + Arrays.toString(options.toArray()) + " по факту " + Arrays.toString(typePaymentsOptions.toArray()));

        for(int i = 0; typePaymentsOptions.size() > i; i++){
            if(!options.get(i).equals(typePaymentsOptions.get(i)))
                throw new FinanceAndDetailsException("Некорректное отображение фильтра! Должно быть - " + Arrays.toString(options.toArray()) + " по факту " + Arrays.toString(typePaymentsOptions.toArray()));
        }
    }
    @Step
    public void select_period_for_period(String startDate, String endDate){
        FinanceAndDetailB2CPrepPage financeAndDetail = getPages().get(FinanceAndDetailB2CPrepPage.class);

        int startDay = Integer.parseInt(startDate.substring(0,startDate.indexOf(" ")));
        String startMount = startDate.substring(startDate.indexOf(" "),startDate.indexOf(" ",startDate.indexOf(" ") + 1));
        String startYear = startDate.substring(startDate.indexOf(" ",startDate.indexOf(" ") + 1),startDate.length());

        int endDay = Integer.parseInt(endDate.substring(0,endDate.indexOf(" ")));
        String endMount = endDate.substring(endDate.indexOf(" "), endDate.indexOf(" ",endDate.indexOf(" ") + 1));
        String endYear = endDate.substring(endDate.indexOf(" ", endDate.indexOf(" ") + 1),endDate.length());

        financeAndDetail.setPeriod(startDay,startMount,startYear,endDay,endMount,endYear);
    }
    @Step
    public void select_type_payments(String typePayments){
        FinanceAndDetailB2CPrepPage financeAndDetail = getPages().get(FinanceAndDetailB2CPrepPage.class);
        financeAndDetail.selectTypePayments(typePayments);
    }
    @Step
    public void check_display_table_with_filter_by_type_payments(String typePayments){
        FinanceAndDetailB2CPrepPage financeAndDetail = getPages().get(FinanceAndDetailB2CPrepPage.class);
        List<FinanceAndDetailB2CPrepPage.RowPayments> listRowsPayment =  financeAndDetail.getAllRowPayments();

        for (FinanceAndDetailB2CPrepPage.RowPayments rowPayments : listRowsPayment) {
            if (!rowPayments.getTypePayments().equals(typePayments)){
                throw new DisplayTablePaymentsException("Ошибка работы фильтра по типу платежа! Задан фильтр [" +  typePayments + "], но в списке присутствуют платежи с типом [" + rowPayments.getTypePayments() + "]");
            }
        }
    }
    @Step
    public void check_display_table_with_filter_by_date(String typePayments){
        FinanceAndDetailB2CPrepPage financeAndDetail = getPages().get(FinanceAndDetailB2CPrepPage.class);
        List<FinanceAndDetailB2CPrepPage.RowPayments> listRowsPayment =  financeAndDetail.getAllRowPayments();

        for (FinanceAndDetailB2CPrepPage.RowPayments rowPayments : listRowsPayment) {
            if (!rowPayments.getTypePayments().equals(typePayments)){
                throw new DisplayTablePaymentsException("Ошибка работы фильтра по типу платежа! Задан фильтр [" +  typePayments + "], но в списке присутствуют платежи с типом [" + rowPayments.getTypePayments() + "]");
            }
        }
    }
    @Step
    public void delete_filter_by_payment_type(){
        FinanceAndDetailB2CPrepPage financeAndDetail = getPages().get(FinanceAndDetailB2CPrepPage.class);
        financeAndDetail.selectTypePayments("Все типы платежей");
    }
    @StepGroup
    public void check_filter_type_payments(){
        FinanceAndDetailB2CPrepPage financeAndDetail = getPages().get(FinanceAndDetailB2CPrepPage.class);
        List<String> options = financeAndDetail.getOptionsFilterTypePayments();
        Random random = new Random();
        int randomNum = 1 + (int)(Math.random()*options.size() - 1);
        String typePayment = options.get(randomNum);
        select_type_payments(typePayment);
        check_display_table_with_filter_by_type_payments(typePayment);

    }
    @StepGroup
    public void check_filter_date(String startDateString, String endDateString) throws ParseException {
        FinanceAndDetailB2CPrepPage financeAndDetail = getPages().get(FinanceAndDetailB2CPrepPage.class);
        select_period_for_period(startDateString, endDateString);

        Date startDate = new SimpleDateFormat("d MMMM yyyy").parse(startDateString);
        Date endDate = new SimpleDateFormat("d MMMM yyyy").parse(endDateString);

        List<FinanceAndDetailB2CPrepPage.RowPayments> listRowsPayment = financeAndDetail.getAllRowPayments();
        for(FinanceAndDetailB2CPrepPage.RowPayments rowPayment : listRowsPayment){
            Date datePayment = rowPayment.getDate();
            if((!datePayment.before(endDate) && !datePayment.equals(endDate)) || (!datePayment.after(startDate) && !datePayment.equals(startDate))){
                throw new DisplayTablePaymentsException("Фильтр по дате работает некорректно! Заданый диапазон дат [" + startDateString + ", " + endDateString + "] в который входит платеж с датой [" + datePayment );
            }
        }

    }
}
