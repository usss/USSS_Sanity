package USSS.pages.b2c;

import USSS.pages.b2c.generalBlocksB2C.HeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

import java.util.List;

import static ch.lambdaj.Lambda.extract;
import static ch.lambdaj.Lambda.on;

public class TariffsListB2CPage extends BlockPageObject {
    public TariffsListB2CPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class = 'header-inner']")
    public HeaderMenu headerMenu;

    @FindBy(xpath = "//div[contains(@id,'currentTariffPanel')]//span[@class='name-intro']//following-sibling::h2")
    protected TextBlock nameCurrentTariff;

    @FindBy(xpath = "//div[@class='tariffs-list']/form//div[contains(@class,'info')]//h2 | //a[contains(@class,'button button-big')]//span[contains(text(),'Выбрать')]//ancestor::tr[contains(@class,'ui-widget-content')]//span[contains(@class,'tariff-title')]")
    protected List<WebElement> listTariffName;

    @FindBy(xpath = "//div[contains(@class,'buttons')]//button//span[contains(text(),'Перейти на тариф')]")
    protected WebElement buttonChangeTariff;

    public String getCurrentTariff(){
        return nameCurrentTariff.getText();
    }
    public List<String> getListTariffs(){
        return extract(listTariffName, on(WebElement.class).getText());
    }
}

