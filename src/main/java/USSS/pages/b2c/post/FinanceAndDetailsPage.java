package USSS.pages.b2c.post;

import USSS.pages.Exceptions.FinanceAndDetailsException;
import USSS.pages.b2c.BaseFinanceAndDetailsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import ru.yandex.qatools.htmlelements.element.Link;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static ch.lambdaj.Lambda.extract;
import static ch.lambdaj.Lambda.on;
/**
 *  pageObject страницы "Финансы и детализация" для B2C postpaid клиентов
 */
public class FinanceAndDetailsPage extends BaseFinanceAndDetailsPage {
    public FinanceAndDetailsPage(WebDriver driver) {
        super(driver);
    }
    /**
     *  Ссылка выгрузки Excel файла
     */
    @FindBy(xpath = "//div[contains(@id,'payments_form')]//div[contains(@id,'xlsExporter')]//a")
    private Link xlsExporterPayments;
    /**
     *  Таблица платежей
     */
    @FindBy(xpath = "//div[contains(@id,'payments_table') and contains(@class,'payments-table')]")
    private Link paymentsTable;
    /**
     *  Список опций фильтра "Тип платежа"
     */
    @FindBy(xpath = "//div[contains(@id,'payments_table')]//table//span[contains(text(),'Тип платежа')]//select/option")
    private List<WebElement> filterTypePayments;
    /**
    *  Метод проверяет отображение элементов на странице
    */
    public void checkDisplayFinanceAndDetailPage(){
        if(!paymentsTable.isEnabled())
            throw new FinanceAndDetailsException("Неотображается таблица платежей");
    }
    /**
     *  Задать фильтр платежей "Дата платежа" с даты
     *
     *  @param day день
     *  @param mount месяц
     *  @param year год
     */
    public void setStartDateFilterPayments(int day, String mount, String year){
        String xPathStartDate = "//div[contains(@id,'payments_table') and contains(@class,'payments-table')]//div[contains(@class,'calendar-filter')]/div[contains(@class,'date-popup')]//div[@class='date-from']//input";
        findBy("//div[contains(@id,'payments_table') and contains(@class,'payments-table')]//div[contains(@class,'calendar-filter')]/b").click();
        findBy(xPathStartDate).waitUntilVisible().click();
        setDate(day,mount,year);

    }
    /**
     *  Задать фильтр платежей "Дата платежа" по дату
     *
     *  @param day день
     *  @param mount месяц
     *  @param year год
     */
    public void setEndDateFilterPayments(int day, String mount, String year){
        String xPathStartDate = "//div[contains(@id,'payments_table') and contains(@class,'payments-table')]//div[contains(@class,'calendar-filter')]/div[contains(@class,'date-popup')]//div[@class='date-to']//input";
        findBy("//div[contains(@id,'payments_table') and contains(@class,'payments-table')]//div[contains(@class,'calendar-filter')]/b").click();
        findBy(xPathStartDate).waitUntilVisible().click();
        setDate(day,mount,year);
    }
    /**
     *
     * @return список опций фильтра "Тип платежа"
     */
    public List<String> getOptionsFilterTypePayments(){
        return extract(filterTypePayments, on(WebElement.class).getAttribute("text"));
    }
    /**
     * Задать фильтр по типу платежа
     *
     * @param typePayments тип платежа
     */
    public void selectTypePaymentsFilterPayments(String typePayments){
        findBy("//div[contains(@id,'payments_table')]//table//span[contains(text(),'Тип платежа')]//div[contains(@class,'ui-selectonemenu-trigger ui-state-default ui-corner-right')]").waitUntilVisible().click();
        findBy("//div[contains(@class,'ui-selectonemenu-items-wrapper')]//li[contains(text(),'" + typePayments + "')]").waitUntilVisible().click();
        waitForAjaxComplete();
    }
    /**
     *
     * @return количество строк в таблице платежей
     */
    public int getCountRowsPayments(){
        return findAll("//div[contains(@id,'payments_table') and contains(@class,'payments-table')]//tbody[contains(@id,'payments_table')]//tr[contains(@class,'ui-widget-content') and @role = 'row']").size();
    }
    /**
     * @return список всех строк из таблицы платежей
     */
    public List<RowPayments> getAllRowPayments(){
        List<RowPayments> res = new ArrayList<>();
        int paymentCount = getCountRowsPayments();
        for (int i = 0; i<paymentCount; i++)
            res.add(new RowPayments(i));
        return res;
    }
    /**
     * Класс строки таблицы платежей
     */
    public class RowPayments{
        private String xPathRowPayment;
        /**
         * @param index индекс строки в таблице (нумерация начинается с 0)
         */
        public RowPayments(int index) {
            xPathRowPayment = "//div[contains(@id,'payments_table') and contains(@class,'payments-table')]//tr[contains(@class,'ui-widget-content') and @data-ri='" + index + "']";
        }
        /**
         * @return тип платежа
         */
        public String getTypePayments() {
            return findBy(xPathRowPayment + "/td[2]").getText();
        }
        /**
         * @return дата платежа
         */
        public Date getDate() throws ParseException {
            String dateStr = findBy(xPathRowPayment + "/td[1]/a").getText();
            Date date = new SimpleDateFormat("dd.MM.yyyy").parse(dateStr);
            return date;
        }
    }

    private void setDate(int day, String mount, String year){
        String xPathCalendar = "//div[@id='ui-datepicker-div']";
        String xPathSelectMount = xPathCalendar + "//div[contains(@class,'ui-datepicker-title')]//select[contains(@class,'ui-datepicker-month')]";
        String xPathSelectYear = xPathCalendar + "//div[contains(@class,'ui-datepicker-title')]//select[contains(@class,'ui-datepicker-year')]";
        String xPathSelectDay = xPathCalendar + "//td[contains(@data-handler,'selectDay')]/a[text()='" + day + "']";

        findBy(xPathSelectMount).selectByVisibleText(mount.substring(0,4).trim());
        findBy(xPathSelectYear).selectByVisibleText(year.trim());
        findBy(xPathSelectDay).click();
        waitForAjaxComplete();
    }
    private void waitForAjaxComplete() {
        setWaitForTimeout(30000);
        waitFor(ajaxComplete());
    }
    private ExpectedCondition ajaxComplete() {
        return new ExpectedCondition() {
            public Boolean apply(Object d) {
                return (Boolean) evaluateJavascript(
                        //"return window.jQuery.active == 0");
                        "return (typeof($) === 'undefined') ? true : !$.active;");
            }
        };
    }
}
