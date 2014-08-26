package USSS.pages.b2c.prep;

import USSS.pages.b2c.blocks.HeaderMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;


public class ConformationChangeOfTariffPage extends BlockPageObject {
    public ConformationChangeOfTariffPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[contains(@class,'buttons')]//button//span[contains(text(),'Перейти на тариф')]")
    private Button buttonChangeTariff;

    @FindBy(xpath = "//div[@class = 'header-inner']")
    private HeaderMenu headerMenu;


    public void clickChangeTariff(){
        buttonChangeTariff.click();
    }
    public void waitSussesChangeTariff(){
        WebDriverWait wait = new WebDriverWait(getDriver(),10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'dashed')]//span[contains(@class,'message-text')]")));
    }
    public void waitInsufficientComverseBalance() throws org.openqa.selenium.TimeoutException{
        WebDriverWait wait = new WebDriverWait(getDriver(),5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'helper-error')]//span[contains(@class,'insufficient-comverse-balance')]")));
    }
}
