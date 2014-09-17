package USSS.pages.b2c;

import USSS.blocks.Balance;
import USSS.blocks.NavigationMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

public class BaseProfilePage extends BlockPageObject {
    public BaseProfilePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class = 'header-inner']")
    public NavigationMenu navigationMenu;
    @FindBy(xpath = "//form[contains(@class,'profile-balance')]")
    public Balance balance;

    public String getBalance(){
        setWaitForTimeout(15000);
        return/* findBy("//form[contains(@class,'profile-balance')]//span[contains(@class,'price')]").getText();*/balance.getBalance();
    }
}
