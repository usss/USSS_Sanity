package USSS.steps.B2CPrepaidSteps;

import USSS.pages.Exceptions.DisplayTablePaymentsException;
import USSS.pages.Exceptions.FinanceAndDetailsException;
import USSS.pages.b2c.prep.FinanceAndDetailsPage;
import USSS.pages.b2c.prep.ProfilePage;
import USSS.steps.AbstractB2CSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class InteractionDetalisationSteps extends AbstractB2CSteps {
    public InteractionDetalisationSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void select_detalisation_for_today(){
        FinanceAndDetailsPage financeAndDetail = getPages().get(FinanceAndDetailsPage.class);
        financeAndDetail.selectPeriod("За сегодня");
    }
    @Step
    public void select_detalisation_for_last_week(){
        FinanceAndDetailsPage financeAndDetail = getPages().get(FinanceAndDetailsPage.class);
        financeAndDetail.selectPeriod("За последнюю неделю");
    }
    @Step
    public void select_detalisation_for_period(String startDate, String endDate){
        FinanceAndDetailsPage financeAndDetail = getPages().get(FinanceAndDetailsPage.class);

        int startDay = Integer.parseInt(startDate.substring(0,startDate.indexOf(" ")));
        String startMount = startDate.substring(startDate.indexOf(" "),startDate.indexOf(" ",startDate.indexOf(" ") + 1));
        String startYear = startDate.substring(startDate.indexOf(" ",startDate.indexOf(" ") + 1),startDate.length());

        int endDay = Integer.parseInt(endDate.substring(0,endDate.indexOf(" ")));
        String endMount = endDate.substring(endDate.indexOf(" "), endDate.indexOf(" ",endDate.indexOf(" ") + 1));
        String endYear = endDate.substring(endDate.indexOf(" ", endDate.indexOf(" ") + 1),endDate.length());

        financeAndDetail.setPeriod(startDay,startMount,startYear,endDay,endMount,endYear);
    }

    @Step
    public void open_finance_and_details_page_and_check_page(){
        ProfilePage profilePage = getPages().get(ProfilePage.class);
        profilePage.navigationMenu.openFinanceAndDetail();
        FinanceAndDetailsPage financeAndDetail = getPages().get(FinanceAndDetailsPage.class);
        financeAndDetail.checkDisplayFinanceAndDetailPage();
    }

    @Step
    public void check_display_options_of_filter_by_type_payments() {
        FinanceAndDetailsPage financeAndDetail = getPages().get(FinanceAndDetailsPage.class);
        List<String> options = new ArrayList<>();
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
    public void select_type_payments(String typePayments){
        FinanceAndDetailsPage financeAndDetail = getPages().get(FinanceAndDetailsPage.class);
        financeAndDetail.selectTypePayments(typePayments);
    }
    @Step
    public void check_display_table_with_filter_by_type_payments(String typePayments){
        FinanceAndDetailsPage financeAndDetail = getPages().get(FinanceAndDetailsPage.class);
        List<FinanceAndDetailsPage.RowPayments> listRowsPayment =  financeAndDetail.getAllRowPayments();

        for (FinanceAndDetailsPage.RowPayments rowPayments : listRowsPayment) {
            if (!rowPayments.getTypePayments().equals(typePayments)){
                throw new DisplayTablePaymentsException("Ошибка работы фильтра по типу платежа! Задан фильтр [" +  typePayments + "], но в списке присутствуют платежи с типом [" + rowPayments.getTypePayments() + "]");
            }
        }
    }
    @Step
    public void check_display_table_with_filter_by_date(String typePayments){
        FinanceAndDetailsPage financeAndDetail = getPages().get(FinanceAndDetailsPage.class);
        List<FinanceAndDetailsPage.RowPayments> listRowsPayment =  financeAndDetail.getAllRowPayments();

        for (FinanceAndDetailsPage.RowPayments rowPayments : listRowsPayment) {
            if (!rowPayments.getTypePayments().equals(typePayments)){
                throw new DisplayTablePaymentsException("Ошибка работы фильтра по типу платежа! Задан фильтр [" +  typePayments + "], но в списке присутствуют платежи с типом [" + rowPayments.getTypePayments() + "]");
            }
        }
    }
    @Step
    public void delete_filter_by_payment_type(){
        FinanceAndDetailsPage financeAndDetail = getPages().get(FinanceAndDetailsPage.class);
        financeAndDetail.selectTypePayments("Все типы платежей");
    }
    @Step
    public void check_upload_excel_file(){
        throw new UnsupportedOperationException("Метод не реализован");
    }
    @StepGroup
    public void check_filter_type_payments(){
        FinanceAndDetailsPage financeAndDetail = getPages().get(FinanceAndDetailsPage.class);
        List<String> options = financeAndDetail.getOptionsFilterTypePayments();
        Random random = new Random();
        int randomNum = 1 + (int)(Math.random()*options.size() - 1);
        String typePayment = options.get(randomNum);
        select_type_payments(typePayment);
        check_display_table_with_filter_by_type_payments(typePayment);

    }
    @StepGroup
    public void check_filter_date(String startDateString, String endDateString) throws ParseException {
        FinanceAndDetailsPage financeAndDetail = getPages().get(FinanceAndDetailsPage.class);
        select_detalisation_for_period(startDateString, endDateString);

        Date startDate = new SimpleDateFormat("d MMMM yyyy").parse(startDateString);
        Date endDate = new SimpleDateFormat("d MMMM yyyy").parse(endDateString);

        List<FinanceAndDetailsPage.RowPayments> listRowsPayment = financeAndDetail.getAllRowPayments();
        for(FinanceAndDetailsPage.RowPayments rowPayment : listRowsPayment){
            Date datePayment = rowPayment.getDate();
            if((!datePayment.before(endDate) && !datePayment.equals(endDate)) || (!datePayment.after(startDate) && !datePayment.equals(startDate))){
                throw new DisplayTablePaymentsException("Фильтр по дате работает некорректно! Заданый диапазон дат [" + startDateString + ", " + endDateString + "] в который входит платеж с датой [" + datePayment );
            }
        }

    }
}
