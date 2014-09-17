package USSS.steps.B2CPostpaidSteps;

import USSS.pages.Exceptions.DisplayTablePaymentsException;
import USSS.pages.Exceptions.FinanceAndDetailsException;
import USSS.pages.b2c.post.FinanceAndDetailsPage;
import USSS.pages.b2c.post.ProfilePage;
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
    public void open_finance_and_details_page_and_check_page(){
        ProfilePage profilePage = getPages().get(ProfilePage.class);
        profilePage.navigationMenu.openFinanceAndDetail();
        FinanceAndDetailsPage financeAndDetail = getPages().get(FinanceAndDetailsPage.class);
        financeAndDetail.checkDisplayFinanceAndDetailPage();
    }
    @Step
    public void set_period_for_filter_payments(String startDate, String endDate){
        FinanceAndDetailsPage financeAndDetail = getPages().get(FinanceAndDetailsPage.class);

        int startDay = Integer.parseInt(startDate.substring(0,startDate.indexOf(" ")));
        String startMount = startDate.substring(startDate.indexOf(" "),startDate.indexOf(" ",startDate.indexOf(" ") + 1));
        String startYear = startDate.substring(startDate.indexOf(" ",startDate.indexOf(" ") + 1),startDate.length());

        int endDay = Integer.parseInt(endDate.substring(0,endDate.indexOf(" ")));
        String endMount = endDate.substring(endDate.indexOf(" "), endDate.indexOf(" ",endDate.indexOf(" ") + 1));
        String endYear = endDate.substring(endDate.indexOf(" ", endDate.indexOf(" ") + 1),endDate.length());

        financeAndDetail.setStartDateFilterPayments(startDay,startMount,startYear);
        financeAndDetail.setEndDateFilterPayments(endDay,endMount,endYear);
    }
    @Step
    public void check_display_options_of_filter_by_type_payments() {
        FinanceAndDetailsPage financeAndDetail = getPages().get(FinanceAndDetailsPage.class);
        List<String> options = new ArrayList<>();
        options.add("Все каналы");
        options.add("Препейд->Постпейд переход");
        options.add("Списание по иск. давности");
        options.add("Агентская Комиссия");
        options.add("Миграция");
        options.add("Безналичный платеж");
        options.add("Акт взаиморасчетов");
        options.add("Наличный платеж");
        options.add("Кредитная карта");

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
        financeAndDetail.selectTypePaymentsFilterPayments(typePayments);
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
    public void delete_filter_by_payment_type(){
        FinanceAndDetailsPage financeAndDetail = getPages().get(FinanceAndDetailsPage.class);
        financeAndDetail.selectTypePaymentsFilterPayments("Все каналы");

    }
    @StepGroup
    public void check_filter_date(String startDateString, String endDateString) throws ParseException {
        FinanceAndDetailsPage financeAndDetail = getPages().get(FinanceAndDetailsPage.class);
        set_period_for_filter_payments(startDateString, endDateString);

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


}
