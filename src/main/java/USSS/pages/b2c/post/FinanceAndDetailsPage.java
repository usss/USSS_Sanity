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

public class FinanceAndDetailsPage extends BaseFinanceAndDetailsPage {
    public FinanceAndDetailsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//div[contains(@id,'payments_form')]//div[contains(@id,'xlsExporter')]//a")
    private Link xlsExporterPayments;

    @FindBy(xpath = "//div[contains(@id,'payments_table') and contains(@class,'payments-table')]")
    private Link paymentsTable;

    @FindBy(xpath = "//div[contains(@id,'payments_table')]//table//span[contains(text(),'Тип платежа')]//select/option")
    private List<WebElement> filterTypePayments;

    public void checkDisplayFinanceAndDetailPage(){
        if(!paymentsTable.isEnabled())
            throw new FinanceAndDetailsException("Неотображается таблица платежей");
    }

    public void setStartDateFilterPayments(int day, String mount, String year){
        String xPathStartDate = "//div[contains(@id,'payments_table') and contains(@class,'payments-table')]//div[contains(@class,'calendar-filter')]/div[contains(@class,'date-popup')]//div[@class='date-from']//input";
        findBy("//div[contains(@id,'payments_table') and contains(@class,'payments-table')]//div[contains(@class,'calendar-filter')]/b").click();
        findBy(xPathStartDate).waitUntilVisible().click();
        setDate(day,mount,year);

    }
    public void setEndDateFilterPayments(int day, String mount, String year){
        String xPathStartDate = "//div[contains(@id,'payments_table') and contains(@class,'payments-table')]//div[contains(@class,'calendar-filter')]/div[contains(@class,'date-popup')]//div[@class='date-to']//input";
        findBy("//div[contains(@id,'payments_table') and contains(@class,'payments-table')]//div[contains(@class,'calendar-filter')]/b").click();
        findBy(xPathStartDate).waitUntilVisible().click();
        setDate(day,mount,year);
    }

    public List<String> getOptionsFilterTypePayments(){
        return extract(filterTypePayments, on(WebElement.class).getAttribute("text"));
    }

    public void selectTypePaymentsFilterPayments(String typePayments){
        findBy("//div[contains(@id,'payments_table')]//table//span[contains(text(),'Тип платежа')]//div[contains(@class,'ui-selectonemenu-trigger ui-state-default ui-corner-right')]").waitUntilVisible().click();
        findBy("//div[contains(@class,'ui-selectonemenu-items-wrapper')]//li[contains(text(),'" + typePayments + "')]").waitUntilVisible().click();
        waitForAjaxComplete();
    }

    public int getCountRowsPayments(){
        return findAll("//div[contains(@id,'payments_table') and contains(@class,'payments-table')]//tbody[contains(@id,'payments_table')]//tr[contains(@class,'ui-widget-content') and @role = 'row']").size();
    }

    public List<RowPayments> getAllRowPayments(){
        List<RowPayments> res = new ArrayList<>();
        int paymentCount = getCountRowsPayments();
        for (int i = 0; i<paymentCount; i++)
            res.add(new RowPayments(i));
        return res;
    }
    public class RowPayments{
        private String xPathRowPayment;
        public RowPayments(int index) {
            xPathRowPayment = "//div[contains(@id,'payments_table') and contains(@class,'payments-table')]//tr[contains(@class,'ui-widget-content') and @data-ri='" + index + "']";
        }
        public String getTypePayments() {
            return findBy(xPathRowPayment + "/td[2]").getText();
        }
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
