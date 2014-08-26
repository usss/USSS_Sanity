package USSS.pages.b2c.prep;

import USSS.pages.b2c.blocks.HeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

public class ProfilePage extends BlockPageObject {

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class = 'header-inner']")
    private HeaderMenu headerMenu;

    public void openTariffs(){
        headerMenu.openTariffs();
    }
}
