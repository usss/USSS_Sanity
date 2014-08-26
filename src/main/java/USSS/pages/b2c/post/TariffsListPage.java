package USSS.pages.b2c.post;

import USSS.pages.Exceptions.ChangeTariffFailException;
import USSS.pages.Exceptions.InsufficientComverseBalanceException;
import USSS.pages.Exceptions.TariffNotFoundException;
import USSS.pages.b2c.AbstractTariffListPage;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TariffsListPage extends AbstractTariffListPage {
    public TariffsListPage(WebDriver driver) {
        super(driver);
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
