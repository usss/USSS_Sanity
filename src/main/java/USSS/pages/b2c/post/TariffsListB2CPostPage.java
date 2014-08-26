package USSS.pages.b2c.post;

import USSS.pages.Exceptions.ChangeTariffFailException;
import USSS.pages.Exceptions.NoFutureTariffException;
import USSS.pages.Exceptions.TariffNotFoundException;
import USSS.pages.b2c.TariffsListB2CPage;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.TextBlock;


public class TariffsListB2CPostPage extends TariffsListB2CPage {
    public TariffsListB2CPostPage(WebDriver driver) {
        super(driver);
    }

    private final String xPathFutureTariffBlock = "//h2[contains(@class,'future-tariff')]//following-sibling::div[contains(@id,'futureTariffPanel')]/form//div[contains(@class,'info')]";

    @FindBy(xpath = xPathFutureTariffBlock + "//h2")
    protected TextBlock futureTariffName;

    @FindBy(xpath = xPathFutureTariffBlock + "//div[contains(@class,'cancel-change-link')]/a")
    protected Link futureTariffCancel;


    @FindBy(xpath = xPathFutureTariffBlock + "//div[contains(@class,'future-tariff-popup')]//button")
    protected WebElementFacade confirmFutureTariffButton;

    public String getFutureTariffName(){
        try {
            return futureTariffName.getText();
        }catch (){
            throw new NoFutureTariffException("Будущий тарифный план");
        }
    }

    public void cancelFutureTariff(){
        futureTariffCancel.click();
        confirmFutureTariffButton.waitUntilVisible().click();
    }

    public void changeTariff(String tariffName){
        try {
            WebElementFacade selectTariff = findBy("//div[@class='tariffs-list']/form//div[contains(@class,'info')]//h2[contains(text(),'" + tariffName + "')]//parent::div[contains(@class,'info')]//preceding-sibling::div[contains(@class,'switch')]//button");
            selectTariff.click();
            WebDriverWait wait = new WebDriverWait(getDriver(), 10);
            wait.until(ExpectedConditions.visibilityOf(buttonChangeTariff));
            buttonChangeTariff.click();
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'info')]//h2[contains(text(),'" + tariffName + "')]//ancestor::div[contains(@class,'service-item tariff-item')]//div[contains(@class,'message message-success')]")));
            }catch (org.openqa.selenium.TimeoutException ex){
                throw new ChangeTariffFailException("Неудачная попытка перехода на тариф [" + tariffName + "]");
            }
        }catch (NoSuchElementException ex){
            throw new TariffNotFoundException("Тариф " + tariffName + " не найден!");
        }
    }
}
