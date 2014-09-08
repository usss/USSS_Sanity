package USSS.pages.b2c;


import USSS.pages.b2c.generalBlocksB2C.HeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

public  class ProfileB2CPage extends BlockPageObject {
    public ProfileB2CPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class = 'header-inner']")
    protected HeaderMenu headerMenu;

    public void openTariffs(){
        headerMenu.openTariffs();
    }
    public void openSOCs(){
        headerMenu.openSocs();
    }
    public void openRequestHistory(){
        headerMenu.openHistoryRequest();
    }
    public void openFinanceAndDetail(){
        headerMenu.openFinanceAndDetail();
    }
}
