package USSS.pages.b2c.prep;

import USSS.blocks.NavigationMenuBlock;
import USSS.pages.Exceptions.FinanceAndDetailsException;
import USSS.pages.b2c.BaseFinanceAndDetailsPage;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.Radio;

import java.io.FileOutputStream;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static ch.lambdaj.Lambda.extract;
import static ch.lambdaj.Lambda.on;
/**
 *  pageObject страницы "Финансы и детализация" для B2C prepaid клиентов
 */
public class FinanceAndDetailsPage extends BaseFinanceAndDetailsPage {
    public FinanceAndDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='header']")
    public NavigationMenuBlock navigationMenuBlock;
    /**
     * поле выбора периода детализации
     */
    @FindBy(xpath = "//div[contains(@class,'fileds-row')]/div[contains(@id,'periodSelec')]//div[contains(@class,'ui-selectonemenu-trigger ui-state-default ui-corner-right')]")
    private WebElement periodSelect;
    /**
     * поле ввода даты периода, при выбраном фильтре "За период"
     */
    @FindBy(xpath = "//div[contains(@class,'fileds-row')]//div[contains(@id,'calendars')]//input")
    private WebElement calendarsInput;
    /**
     * Кнопка "Обновить данные"
     */
    @FindBy(xpath = "//div[contains(@class,'fileds-row')]//div[contains(@class,'refresh-data-button')]//button")
    private Button refreshDataButton;
    /**
     * Кнопка "Сохранение отчета"
     */
    @FindBy(xpath = "//div[contains(@class,'submit-or-cancel')]/button")
    private Button reportDownloadButton;
    /**
     * Радиобатон выбора PDF
     */
    @FindBy(xpath = "//input[contains(@value, 'PDF')]")
    private Button radioBtnSelectPdf;
    /**
     * Радиобатон выбора XLS
     */
    @FindBy(xpath = "//input[contains(@value, 'XLS')]")
    private Button radioBtnSelectXls;

    /**
     * Ссылка "Обновить данные" для платежей
     */
    @FindBy(xpath = "//div[contains(@class,'update-link-container')]//a")
    private Link updateLinkContainer;
    /**
     * Ссылка "Выгрузить в Excel" для платежей
     */
    @FindBy(xpath = "//div[@id='xlsExporter']/a")
    private Link xlsExporter;
    /**
     * Кнопка "Сохранить отчет"
     */
    @FindBy(xpath = "//div[contains(@class,'report-download-button')]/button")
    private Button btnSaveReport;
    /**
     * Список опций фильтра для платежей "Тип платежа"
     */

    @FindBy(xpath = "//div[contains(@id,'paymentsTable')]//table//span[contains(text(),'Тип платежа')]//select/option")
    private List<WebElement> filterTypePayments;
    /**
     * xPath к всплывающему календарю
     */
    private String XPATH_DATE_POPUP = "//div[contains(@class,'datepick-popup')]";
    /**
     * Ссылка на файл
     */
    @FindBy(xpath = "//a[contains(text(),'Отчет ')]")
    public Link fileDownload;

    /**
     * Метод проверяет отображение элементов на странице
     */
    public void checkDisplayFinanceAndDetailPage() {
        if (!periodSelect.isEnabled())
            throw new FinanceAndDetailsException("Неотображается поле выбора периода");
        if (!refreshDataButton.isEnabled())
            throw new FinanceAndDetailsException("Неотображается кнопка \"Обновить данные\"");
//        if (!reportDownloadButton.isEnabled())
       //     throw new FinanceAndDetailsException("Неотображается кнопка \"Сохранение отчета\"");
        if (!updateLinkContainer.isEnabled())
            throw new FinanceAndDetailsException("Неотображается ссылка \"Обновить данные\"");
       // if (!confirmPeriodOptions())
      //  {
       //     throw new FinanceAndDetailsException("Неверное отображение выбора периода");
       // }
    }

    public void checkSaveReport(){
        btnSaveReport.click();
        waitFor("//div[contains(@class,'offer-popup-inner details-format-selector')]");
    }

    /**
     * Задать фильтр отображения детализации
     *
     * @param period фильтр который нужно применить
     */
    public void selectPeriod(String period) {
        periodSelect.click();
        findBy("//div[contains(@class,'ui-selectonemenu-items-wrapper')]//li[contains(text(),'" + period + "')]").waitUntilVisible().click();
        waitForAjaxComplete();
    }


    /**
     * Отображает детализацию за указанный период
     *
     * @param startDay   день начала периода
     * @param startMount месяц начала периода
     * @param startYear  год начала периода
     * @param endDay     день конца периода
     * @param endMount   месяц конца периода
     * @param endYear    год конца периода
     */
    public void setPeriod(int startDay, String startMount, String startYear, int endDay, String endMount, String endYear) {
        selectPeriod("За период");
        shouldBeVisible(calendarsInput);
        calendarsInput.click();
        waitFor(XPATH_DATE_POPUP);
        setStartDate(startDay, startMount, startYear);
        setEndDate(endDay, endMount, endYear);
        refreshDataButton.click();
        waitForAjaxComplete();
    }

    public void btnDowloadReportClick(){


        reportDownloadButton.click();
        waitFor("//span[contains(text(),'Готово')]");

    }

    public void clickLinkDownloadFileReport() throws IOException {
        waitFor("//a[contains(text(),'Отчет ')]");
        fileDownload.click();

    }
    /**
     * @return список опций фильтра "Тип платежа"
     */
    public List<String> getOptionsFilterTypePayments() {
        return extract(filterTypePayments, on(WebElement.class).getAttribute("text"));
    }

    /**
     * Задать фильтр по типу платежа
     *
     * @param typePayments тип платежа
     */
    public void selectTypePayments(String typePayments) {
        findBy("//div[contains(@id,'paymentsTable')]//table//span[contains(text(),'Тип платежа')]//div[contains(@class,'ui-selectonemenu-trigger ui-state-default ui-corner-right')]").waitUntilVisible().click();
        findBy("//div[contains(@class,'ui-selectonemenu-items-wrapper')]//li[contains(text(),'" + typePayments + "')]").waitUntilVisible().click();
        waitForAjaxComplete();
    }

    /**
     * @return количество строк в таблице платежей
     */
    public int getCountRowsPayments() {
        return findAll("//tbody[contains(@id,'paymentsTable')]//tr[contains(@class,'ui-widget-content')]").size();
    }

    /**
     * @return список всех строк из таблицы платежей
     */
    public List<RowPayments> getAllRowPayments() {
        List<RowPayments> res = new ArrayList<RowPayments>();
        int paymentCount = getCountRowsPayments();
        for (int i = 0; i < paymentCount; i++)
            res.add(new RowPayments(i));
        return res;
    }
    public void  setRadioBtnSelectPdf() {
        radioBtnSelectXls.click();
    }

    /**
     * Класс строки таблицы платежей
     */
    public class RowPayments {
        private String xPathRowPayment;

        /**
         * @param index индекс строки в таблице (нумерация начинается с 0)
         */
        public RowPayments(int index) {
            xPathRowPayment = "//tr[contains(@class,'ui-widget-content') and @data-ri='" + index + "']";
        }

        /**
         * @return тип платежа
         */
        public String getTypePayments() {
            return findBy(xPathRowPayment + "/td[3]").getText();
        }

        /**
         * @return дата платежа
         */
        public Date getDate() throws ParseException {
            String dateStr = findBy(xPathRowPayment + "/td[1]").getText();
            Date date = new SimpleDateFormat("d MMM yyyy HH:mm:ss").parse(dateStr);
            return date;
        }
    }

    private void setEndDate(int day, String mount, String year) {
        String firstDate = getFirstMount();
        String lastDate = getLastMount();
        if (firstDate.contains(year.trim())) {
            if (firstDate.contains(mount.trim()))
                clickDateMountFirst(day);
            else if (lastDate.contains(year.trim())) {
                if (lastDate.contains(mount.trim()))
                    clickDateMountLast(day);
                else {
                    clickNext();
                    setEndDate(day, mount, year);
                }
            }
        } else if (lastDate.contains(year.trim())) {
            if (lastDate.contains(mount.trim()))
                clickDateMountLast(day);
            else {
                clickNext();
                setEndDate(day, mount, year);
            }
        } else {
            clickNext();
            setEndDate(day, mount, year);
        }
    }

    private void setStartDate(int day, String mount, String year) {
        String firstDate = getFirstMount();
        String lastDate = getLastMount();
        if (lastDate.contains(year.trim())) {
            if (lastDate.contains(mount.trim())) {
                clickDateMountLast(day);
            } else if (firstDate.contains(year.trim())) {
                if (firstDate.contains(mount.trim()))
                    clickDateMountFirst(day);
                else {
                    clickPrev();
                    setStartDate(day, mount, year);
                }
            } else {
                clickPrev();
                setStartDate(day, mount, year);
            }
        } else if (firstDate.contains(year.trim())) {
            if (getLastMount().contains(mount.trim())) {
                clickDateMountFirst(day);
            } else {
                clickPrev();
                setStartDate(day, mount, year);
            }
        } else {
            clickPrev();
            setStartDate(day, mount, year);
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

    private String getFirstMount() {
        return findBy(XPATH_DATE_POPUP + "//div[contains(@class,'datepick-month first')]//div[contains(@class,'datepick-month-header')]").getText();
    }

    private String getLastMount() {
        return findBy(XPATH_DATE_POPUP + "//div[contains(@class,'datepick-month last')]//div[contains(@class,'datepick-month-header')]").getText();
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

    private boolean confirmPeriodOptions() {
        List<WebElementFacade> cbElements = findAll("//div[contains(@id,\"finInfoIndexPage:centerColumnFilter:periodSelect_panel\")]//li");
        List<String> obsList = Arrays.asList("За сегодня", "За последнюю неделю");
        for (WebElementFacade wef : cbElements) {
            for (String obs : obsList) {
                if (wef.getText().contains(obs)) {
                    //success
                } else {
                   // return  false;
                }
            }

        }
        return true;
    }
}
