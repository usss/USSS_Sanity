package USSS.pages.b2b.post.ple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

/**
 * Created by KPodberezin on 26.09.2014.
 */
public class ManagerContractPage extends BlockPageObject {

    public ManagerContractPage(WebDriver driver) {
        super(driver);
    }

    /**
     * номера абонентов в таблице
     */
    @FindBy(xpath = "//tbody[contains(@id,'mobileDataForm:abonents_data')]//td[contains(@class,'custom-heading column-block')]/a")
    private Link linkUserNumber;
    /**
     * кнопка День
     */
    @FindBy(xpath = "//div[contains(@class,'select-one-button')]//span[contains(text(),'День')]")
    private Button btnDay;
    /**
     * кнопка текущего периода, когда еще не выбрана
     */
    @FindBy(xpath = "//div[contains(@class,'select-one-button')]//a[contains(text(),'День')]")
    private Link aDay;
    /**
     * кнопка Неделя, когда уже выбрана
     */
    @FindBy(xpath = "//div[contains(@class,'select-one-button')]//span[contains(text(),'Неделя')]")
    private Button btnWeek;
    /**
     * кнопка Неделя, когда еще не выбрана
     */
    @FindBy(xpath = "//div[contains(@class,'select-one-button')]//a[contains(text(),'Неделя')]")
    private Link aWeek;
    /**
     * кнопка Две неделя, когда уже выбрана
     */
    @FindBy(xpath = "//div[contains(@class,'select-one-button')]//span[contains(text(),'Две недели')]")
    private Button btnTwoWeek;
    /**
     * кнопка Две недели, когда еще не выбрана
     */
    @FindBy(xpath = "//div[contains(@class,'select-one-button')]//a[contains(text(),'Две недели')]")
    private Link aTwoWeek;
    /**
     * кнопка Месяц, когда уже выбрана
     */
    @FindBy(xpath = "//div[contains(@class,'select-one-button')]//span[contains(text(),'Месяц')]")
    private Button btnMonth;
    /**
     * кнопка Месяц, когда еще не выбрана
     */
    @FindBy(xpath = "//div[contains(@class,'select-one-button')]//a[contains(text(),'Месяц')]")
    private Link aMonth;
    /**
     * кнопка Задать вручную, когда уже выбрана
     */
    @FindBy(xpath = "//div[contains(@class,'select-one-button')]//span[contains(text(),'Задать вручную')]")
    private Button btnCustomPeriod;
    /**
     * кнопка Задать вручную, когда еще не выбрана
     */
    @FindBy(xpath = "//div[contains(@class,'select-one-button')]//a[contains(text(),'Задать вручную')]")
    private Link aCustomPeriod;
    /**
     * кнопка Получить детализацию
     */
    @FindBy(xpath = "//button[contains(@id,'pleCallDetalizationForm')]//span[contains(text(),'Заказать детализацию')]")
    private Button btnGetDetails;
    /**
     * кнопка Выбора типа детализации
     */
    @FindBy(xpath = "//div[contains(@class,'ui-selectonemenu ui-widget ui-state-default ui-corner-all ui-helper-clearfix white-bgr')]//div[contains(@class,'ui-selectonemenu-trigger ui-state-default ui-corner-right')]//span[contains(@class,'ui-icon ui-icon-triangle-1-s')]")
    private Button btnSetType;


    public void onClickNumberLink() {
        linkUserNumber.click();
    }

    public void onClickGetDetails() {
        btnGetDetails.click();
        waitForAjaxComplete();
    }

    public void selectTypeImport(String period) {
        btnSetType.click();
        findBy("//ul[contains(@class,'ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset')]//li[contains(text(),'" + period + "')]").waitUntilVisible().click();
        waitForAjaxComplete();
    }

    public void selectDay() {
        try {
            aDay.click();
        } catch (Exception e) {
            btnDay.click();
        }
    }

    public void selectWeek() {
        try {
            aWeek.click();
        } catch (Exception e) {
            btnWeek.click();
        }
    }

    public void selectTwoWeek() {
        try {
            aTwoWeek.click();
        } catch (Exception e) {
            btnTwoWeek.click();
        }
    }

    public void selectMonth() {
        try {
            aMonth.click();
        } catch (Exception e) {
            btnMonth.click();
        }
    }

    //править!!!!!!!!!!!!!!!!!!!!!!!!!
    public void setStartDate(int day, String mount, String year) {
        String xPathCalendarBtn = "//div[contains(@class,'row period')]//input[contains(@id,'minDatePeriod')]";
        String xPathCalendar = "//div[@id='ui-datepicker-div']";
        String xPathSelectMount = xPathCalendar + "//div[contains(@class,'ui-datepicker-title')]//select[contains(@class,'ui-datepicker-month')]";
        String xPathSelectYear = xPathCalendar + "//div[contains(@class,'ui-datepicker-title')]//select[contains(@class,'ui-datepicker-year')]";
        String xPathSelectDay = xPathCalendar + "//td[contains(@data-handler,'selectDay')]/a[text()='" + day + "']";

        findBy(xPathCalendarBtn).click();
        findBy(xPathSelectMount).selectByVisibleText(mount.substring(0, 3).trim());
        findBy(xPathSelectYear).selectByVisibleText(year.trim());
        findBy(xPathSelectDay).click();
        waitForAjaxComplete();
    }

    public void setFinishDate(int day, String mount, String year) {
        String xPathCalendarBtn = "//div[contains(@class,'row period')]//input[contains(@id,'maxDatePeriod')]";
        String xPathCalendar = "//div[@id='ui-datepicker-div']";
        String xPathSelectMount = xPathCalendar + "//div[contains(@class,'ui-datepicker-title')]//select[contains(@class,'ui-datepicker-month')]";
        String xPathSelectYear = xPathCalendar + "//div[contains(@class,'ui-datepicker-title')]//select[contains(@class,'ui-datepicker-year')]";
        String xPathSelectDay = xPathCalendar + "//td[contains(@data-handler,'selectDay')]/a[text()='" + day + "']";

        findBy(xPathCalendarBtn).click();
        findBy(xPathSelectMount).selectByVisibleText(mount.substring(0, 3).trim());
        findBy(xPathSelectYear).selectByVisibleText(year.trim());
        findBy(xPathSelectDay).click();
        waitForAjaxComplete();
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