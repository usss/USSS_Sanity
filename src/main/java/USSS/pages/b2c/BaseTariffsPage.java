package USSS.pages.b2c;

import USSS.blocks.NavigationMenuBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

import java.util.List;

import static ch.lambdaj.Lambda.extract;
import static ch.lambdaj.Lambda.on;
/**
 * Базовый pageObject страницы "Тарифы" для B2C postpaid и B2C prepaid клиентов
 */
public class BaseTariffsPage extends BlockPageObject {
    public BaseTariffsPage(WebDriver driver) {
        super(driver);
    }
    /**
     * Блок для навигации по главному Меню
     */
    @FindBy(xpath = "//div[@class = 'header-inner']")
    public NavigationMenuBlock navigationMenu;
    /**
     * Текстовый блок содержащий имя текущего тарифа
     */
    @FindBy(xpath = "//div[contains(@id,'currentTariffPanel')]//span[@class='name-intro']//following-sibling::h2")
    protected TextBlock nameCurrentTariff;
    /**
     * Список доступных тарифов
     */
    @FindBy(xpath = "//div[@class='tariffs-list']/form//div[contains(@class,'info')]//h2 | //a[contains(@class,'button button-big')]//span[contains(text(),'Выбрать')]//ancestor::tr[contains(@class,'ui-widget-content')]//span[contains(@class,'tariff-title')]")
    protected List<WebElement> listTariffName;
    /**
     * Кнопка подтверждения перехода на тариф
     */
    @FindBy(xpath = "//div[contains(@class,'buttons')]//button//span[contains(text(),'Перейти на тариф')]")
    protected WebElement buttonChangeTariff;
    /**
     * @return Имя текущего тарифа
     */
    public String getCurrentTariff(){
        return nameCurrentTariff.getText();
    }
    /**
     * @return Список доступных тарифов
     */
    public List<String> getListTariffs(){
        return extract(listTariffName, on(WebElement.class).getText());
    }
}

