package USSS.blocks;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

public class NavigationMenu extends HtmlElement {

    @FindBy(xpath = "//a[@name='preProfile']")
    private Link profileLink;

    @FindBy(xpath = "//form[@id='noticeInHeader']/a")
    private Link noticeLink;

    @FindBy(xpath = "//li[contains(@class,'nav-settings')]/a")
    private Link settingsLink;

    @FindBy(xpath = "//li[contains(@class,'nav-tariffs')]/a")
    private Link tariffsLink;

    @FindBy(xpath = "//li[contains(@class,'nav-services')]/a")
    private Link socsLink;

    @FindBy(xpath = "//li[contains(@class,'nav-fininfo')]/a")
    private Link financeLink;

    @FindBy(xpath = "//li[contains(@class,'nav-shared-internet')]/form/a")
    private Link sharedInternetLink;

    @FindBy(xpath = "//li[contains(@class,'nav-claims')]/a")
    private Link historyRequestLink;

    @FindBy(xpath = "//li[contains(@class,'nav-feedback')]/a")
    private Link helpAndFeedbackLink;

    @FindBy(xpath = "//li[contains(@class,'nav-payment')]/a")
    private Link paymentLink;

    @FindBy(xpath = "//div[contains(@class,'logout')]/a")
    private Link loqOut;

    public void openProfile(){
        profileLink.click();
    }
    public void openNotice(){
        noticeLink.click();
    }
    public void openSettings(){
        settingsLink.click();
    }
    public void openTariffs(){
        tariffsLink.click();
    }
    public void openSocs(){
        socsLink.click();
    }
    public void openFinanceAndDetail(){
        financeLink.click();
    }
    public void openSharedInternet(){
        sharedInternetLink.click();
    }
    public void openHistoryRequest(){
        historyRequestLink.click();
    }
    public void openHelpAndFeedback(){
        helpAndFeedbackLink.click();
    }
    public void openPayment(){
        paymentLink.click();
    }
    public void logOut(){
        loqOut.click();
    }
}
