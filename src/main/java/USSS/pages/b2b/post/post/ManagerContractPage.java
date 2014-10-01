package USSS.pages.b2b.post.post;

import USSS.pages.b2c.BaseFinanceAndDetailsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
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
     * кнопка текущего периода, когда уже выбрана
     */
    @FindBy(xpath = "//span[contains(@id,'reportButtonsForm:leftButtonLabel') And contains(text(),'Текущий период')]")
    private Button btnCurrentPeriod;
    /**
     * кнопка текущего периода, когда еще не выбрана
     */
    @FindBy(xpath = "//a[contains(@id,'reportButtonsForm:leftButton') And contains(text(),'Текущий период')]")
    private Link aCurrentPeriod;
    /**
     * кнопка по счету, когда уже выбрана
     */
    @FindBy(xpath = "//span[contains(@id,'reportButtonsForm:rightButtonLabel') And contains(text(),'По счёту')]")
    private Button btnCheck;
    /**
     * кнопка по счету, когда еще не выбрана
     */
    @FindBy(xpath = "//a[contains(@id,'reportButtonsForm:rightButton') And contains(text(),'По счёту')]")
    private Link aCheck;
    /**
     * кнопка Получить детализацию
     */
    @FindBy(xpath = "//button[contains(@id,'reportDetailUnbilledButtonsForm:offlineReportButton')]")
    private Button btnGetDetails;
    /**
     * кнопка Выгрузить в эксель
     */
    @FindBy(xpath = "//span[contains(text(),'Выгрузить в Excel')]")
    private Button btnImpordDetails;


    public void onClickNumberLink() {
        linkUserNumber.click();
    }

    public void onClickCurrentPeriod(){
        try {
            btnCurrentPeriod.click();
        }
        catch(Exception e) {}
        try {
            aCurrentPeriod.click();
        }
        catch (Exception e){}
    }

    public void onClickCheck(){
        try {
            btnCheck.click();
        }
        catch(Exception e) {}
        try {
            aCheck.click();
        }
        catch (Exception e){}
    }

    public  void  onClickGetDetails(){
        btnGetDetails.click();
    }

    public void  onClickImportDetails(){
        btnImpordDetails.click();
    }
}