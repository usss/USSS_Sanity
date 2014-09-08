package USSS.pages.b2c.prep;

import USSS.pages.Exceptions.FinanceAndDetailsException;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.Select;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static ch.lambdaj.Lambda.extract;
import static ch.lambdaj.Lambda.on;

public class FinanceAndDetailB2CPrepPage extends BlockPageObject {
    public FinanceAndDetailB2CPrepPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class,'fileds-row')]/div[contains(@id,'periodSelec')]//div[contains(@class,'ui-selectonemenu-trigger ui-state-default ui-corner-right')]")
    private WebElement periodSelect;

    @FindBy(xpath = "//div[contains(@class,'fileds-row')]//div[contains(@id,'calendars')]//input")
    private WebElement calendarsInput;

    @FindBy(xpath = "//div[contains(@class,'fileds-row')]//div[contains(@class,'refresh-data-button')]//button")
    private Button refreshDataButton;

    @FindBy(xpath = "//div[contains(@class,'report-download-button')]/button")
    private Button reportDownloadButton;

    @FindBy(xpath = "//div[contains(@class,'update-link-container')]//a")
    private Link updateLinkContainer;

    @FindBy(xpath = "//div[@id='xlsExporter']/a")
    private Link xlsExporter;

    @FindBy(xpath = "//div[contains(@id,'paymentsTable')]//table")
    private Link paymentsTable;

    @FindBy(xpath = "//div[contains(@id,'paymentsTable')]//table//span[contains(text(),'Тип платежа')]//select/option")
    private List<WebElement> filterTypePayments;

    private String XPATH_DATE_POPUP = "//div[contains(@class,'datepick-popup')]";

    public void checkDisplayFinanceAndDetailPage(){
        if(!periodSelect.isEnabled())
            throw new FinanceAndDetailsException("Неотображается поле выбора периода");
        if(!refreshDataButton.isEnabled())
            throw new FinanceAndDetailsException("Неотображается кнопка \"Обновить данные\"");
        if(!reportDownloadButton.isEnabled())
            throw new FinanceAndDetailsException("Неотображается кнопка \"Сохранение отчета\"");
        if(!updateLinkContainer.isEnabled())
            throw new FinanceAndDetailsException("Неотображается ссылка \"Обновить данные\"");
        }
    public void selectPeriod(String period){
        periodSelect.click();
        findBy("//div[contains(@class,'ui-selectonemenu-items-wrapper')]//li[contains(text(),'" + period + "')]").waitUntilVisible().click();
    }

    public void setPeriod(int startDay, String startMount, String startYear, int endDay, String endMount, String endYear){
        selectPeriod("За период");
        shouldBeVisible(calendarsInput);
        calendarsInput.click();
        waitFor(XPATH_DATE_POPUP);
        setStartDate(startDay, startMount, startYear);
        setEndDate(endDay, endMount, endYear);
        refreshDataButton.click();
        waitForAjaxComplete();
    }
    public List<String> getOptionsFilterTypePayments(){
        return extract(filterTypePayments, on(WebElement.class).getAttribute("text"));
    }

    public void selectTypePayments(String typePayments){
        findBy("//div[contains(@id,'paymentsTable')]//table//span[contains(text(),'Тип платежа')]//div[contains(@class,'ui-selectonemenu-trigger ui-state-default ui-corner-right')]").waitUntilVisible().click();
        findBy("//div[contains(@class,'ui-selectonemenu-items-wrapper')]//li[contains(text(),'" + typePayments + "')]").waitUntilVisible().click();
        waitForAjaxComplete();
    }

    public int getCountRowsPayments(){
        return findAll("//tbody[contains(@id,'paymentsTable')]//tr[contains(@class,'ui-widget-content')]").size();
    }
    public List<RowPayments> getAllRowPayments(){
        List<RowPayments> res = new ArrayList<RowPayments>();
        int paymentCount = getCountRowsPayments();
        for (int i = 0; i<paymentCount; i++)
            res.add(new RowPayments(i));
        return res;
    }
    public class RowPayments{
        private String xPathRowPayment;
        public RowPayments(int index) {
            xPathRowPayment = "//tr[contains(@class,'ui-widget-content') and @data-ri='" + index + "']";
        }
        public String getTypePayments() {
            return findBy(xPathRowPayment + "/td[3]").getText();
        }
        public Date getDate() throws ParseException {
            String dateStr = findBy(xPathRowPayment + "/td[1]").getText();
            Date date = new SimpleDateFormat("d MMM yyyy HH:mm:ss").parse(dateStr);
            return date;
        }
    }











    private void setEndDate(int day, String mount, String year){
        String firstDate = getFirstMount();
        String lastDate = getLastMount();
        if(firstDate.contains(year.trim())) {
            if(firstDate.contains(mount.trim()))
                clickDateMountFirst(day);
            else if (lastDate.contains(year.trim())){
                if (lastDate.contains(mount.trim()))
                    clickDateMountLast(day);
                else{
                    clickNext();
                    setEndDate(day,mount,year);
                }
            }
        }else if (lastDate.contains(year.trim())){
            if (lastDate.contains(mount.trim()))
                clickDateMountLast(day);
            else {
                clickNext();
                setEndDate(day,mount,year);
            }
        }else {
            clickNext();
            setEndDate(day,mount,year);
        }
    }
    private void setStartDate(int day, String mount, String year){
        String firstDate = getFirstMount();
        String lastDate = getLastMount();
        if(lastDate.contains(year.trim())){
            if(lastDate.contains(mount.trim())){
                clickDateMountLast(day);
            }else if (firstDate.contains(year.trim())){
                if(firstDate.contains(mount.trim()))
                    clickDateMountFirst(day);
                else{
                    clickPrev();
                    setStartDate(day,mount,year);
                }
            }else {
                clickPrev();
                setStartDate(day,mount,year);
            }
        }else if (firstDate.contains(year.trim())){
            if(getLastMount().contains(mount.trim())){
                clickDateMountFirst(day);
            }else{
                clickPrev();
                setStartDate(day,mount,year);
            }
        }else{
            clickPrev();
            setStartDate(day,mount,year);
        }
    }

    private void clickDateMountFirst(int day) {
        findBy(XPATH_DATE_POPUP + "//div[contains(@class,'datepick-month first')]//table//a[text() = '" + day + "']").click();
    }
    private void clickDateMountLast(int day) {
        findBy(XPATH_DATE_POPUP + "//div[contains(@class,'datepick-month last')]//table//a[text() = '" + day + "']").click();
    }

    private void clickPrev() {
        findBy("//a[contains(@class,'datepick-cmd-prev')]").click();
    }
    private void clickNext() {
        findBy("//a[contains(@class,'datepick-cmd-next')]").click();
    }

    private String getFirstMount(){
        return findBy(XPATH_DATE_POPUP +  "//div[contains(@class,'datepick-month first')]//div[contains(@class,'datepick-month-header')]").getText();
    }
    private String getLastMount(){
        return findBy(XPATH_DATE_POPUP +  "//div[contains(@class,'datepick-month last')]//div[contains(@class,'datepick-month-header')]").getText();
    }

    private void waitForAjaxComplete() {
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
