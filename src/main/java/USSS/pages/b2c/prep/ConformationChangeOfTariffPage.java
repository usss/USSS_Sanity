package USSS.pages.b2c.prep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;
/**
 *  pageObject страницы "Подтверждение перехода на тариф" для B2C prepaid клиентов
 */
public class ConformationChangeOfTariffPage extends BlockPageObject {
    public ConformationChangeOfTariffPage(WebDriver driver) {
        super(driver);
    }
    /**
     *  Кнопка перехода на тариф
     */
    @FindBy(xpath = "//div[contains(@class,'buttons')]//button//span[contains(text(),'Перейти на тариф')]")
    private Button buttonChangeTariff;

    public void clickChangeTariff(){
        buttonChangeTariff.click();
    }
    /**
     *  Ожидание успешного перехода на тариф
     */
    public void waitSussesChangeTariff(){
        WebDriverWait wait = new WebDriverWait(getDriver(),10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'dashed')]//span[contains(@class,'message-text')]")));
    }
    /**
     *  Ожидание не успешного перехода на тариф, из-за отрицательного баланса
     */
    public void waitInsufficientComverseBalance() throws org.openqa.selenium.TimeoutException{
        WebDriverWait wait = new WebDriverWait(getDriver(),5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'helper-error')]//span[contains(@class,'insufficient-comverse-balance')]")));
    }
}
