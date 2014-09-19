package USSS.pages.b2c.prep;

import USSS.pages.Exceptions.InsufficientComverseBalanceException;
import USSS.pages.Exceptions.TariffNotFoundException;
import USSS.pages.b2c.BaseTariffsPage;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;
/**
 *  pageObject страницы "Тарифы" для B2C prepaid клиентов
 */
public class TariffsPage extends BaseTariffsPage {
    public TariffsPage(WebDriver driver) {
        super(driver);
    }
    /**
     * Метод смены тарифа
     *
     * @param tariffName Имя тарифа для перехода
     *
     * @throws  TariffNotFoundException если тарифа нет в списке доступных
     * @throws InsufficientComverseBalanceException если недостаточно баланса для подключения тарифа
     */
    public void changeTariff(String tariffName) {
        //блок подключения тарифа из Линейки
       try{
           String xPath = "//span[contains(@class,'tariff-title') and text()='" + tariffName + "']//ancestor::tr[contains(@class,'ui-widget-content')]";
           WebElementFacade selectTariff = this.findBy(xPath);
           try {
               selectTariff.findBy(xPath + "//span[contains(@class,'icon icon-connected')]");
               throw new TariffNotFoundException("Тариф " + tariffName + " уже активен! Выберите другой.");
           }catch (NoSuchElementException ex){
               selectTariff.findBy(By.xpath(xPath + "//td[contains(@class,'fee')]/a")).click();
               ConformationChangeOfTariffPage conformationChangeOfTariffPage = getPages().get(ConformationChangeOfTariffPage.class);
               try{
                   conformationChangeOfTariffPage.waitInsufficientComverseBalance();
                   throw new InsufficientComverseBalanceException("Недостаточно баланса для перехода на тариф - " + tariffName);
               }catch (org.openqa.selenium.TimeoutException e) {
                   conformationChangeOfTariffPage.clickChangeTariff();
                   conformationChangeOfTariffPage.waitSussesChangeTariff();
               }
           }
       }catch (NoSuchElementException e){
           //блок подключения обычного
           try {
               WebElementFacade selectTariff = findBy("//div[@class='tariffs-list']/form//div[contains(@class,'info')]//h2[contains(text(),'" + tariffName + "')]//parent::div[contains(@class,'info')]//preceding-sibling::div[contains(@class,'switch')]//button");
               selectTariff.click();
               WebDriverWait wait = new WebDriverWait(getDriver(), 10);
               wait.until(ExpectedConditions.visibilityOf(buttonChangeTariff));
               buttonChangeTariff.click();
               try {
                   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'info')]//h2[contains(text(),'" + tariffName + "')]//ancestor::div[contains(@class,'service-item tariff-item')]//div[contains(@class,'message message-success')]")));
               }catch (org.openqa.selenium.TimeoutException ex){
                   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'info')]//h2[contains(text(),'" + tariffName + "')]//ancestor::div[contains(@class,'service-item tariff-item')]//span[contains(@class,'insufficient-comverse-balance')]")));
                   throw new InsufficientComverseBalanceException("Недостаточно баланса для перехода на тариф - " + tariffName);
               }
           }catch (NoSuchElementException ex){
               throw new TariffNotFoundException("Тариф " + tariffName + " не найден!");
           }
       }
   }

}
