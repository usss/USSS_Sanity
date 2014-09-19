package USSS.pages.b2c;

import USSS.blocks.Balance;
import USSS.blocks.NavigationMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;
/**
 * Базовый pageObject страницы "Профиль" для B2C postpaid и B2C prepaid клиентов
 */
public class BaseProfilePage extends BlockPageObject {
    public BaseProfilePage(WebDriver driver) {
        super(driver);
    }
    /**
     * Блок для навигации по главному Меню
     */
    @FindBy(xpath = "//div[@class = 'header-inner']")
    public NavigationMenu navigationMenu;
    /**
     * Блок отображения баланса
     */
    @FindBy(xpath = "//form[contains(@class,'profile-balance')]")
    public Balance balance;
    /**
     * @return Значение баланса в виде *.руб.
     */
    public String getBalance(){
        setWaitForTimeout(15000);
        return/* findBy("//form[contains(@class,'profile-balance')]//span[contains(@class,'price')]").getText();*/balance.getBalance();
    }
}
