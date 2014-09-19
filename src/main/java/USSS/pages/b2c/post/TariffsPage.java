package USSS.pages.b2c.post;

import USSS.pages.Exceptions.ChangeTariffException;
import USSS.pages.Exceptions.NoFutureTariffException;
import USSS.pages.Exceptions.TariffNotFoundException;
import USSS.pages.b2c.BaseTariffsPage;
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

/**
 *  pageObject страницы "Тарифы" для B2C postpaid клиентов
 */
public class TariffsPage extends BaseTariffsPage {
    public TariffsPage(WebDriver driver) {
        super(driver);
    }

    private final String xPathFutureTariffBlock = "//h2[contains(@class,'future-tariff')]//following-sibling::div[contains(@id,'futureTariffPanel')]/form//div[contains(@class,'info')]";
    /**
     *  тестовый блок содержащий имя будущего тарифного плана
     */
    @FindBy(xpath = xPathFutureTariffBlock + "//h2")
    protected TextBlock futureTariffName;
    /**
     *  link отмены будущего тарифного плана
     */
    @FindBy(xpath = xPathFutureTariffBlock + "//div[contains(@class,'cancel-change-link')]/a")
    protected Link futureTariffCancel;
    /**
     *  кнопка подтверждения перехода на тариф
     */
    @FindBy(xpath = xPathFutureTariffBlock + "//div[contains(@class,'future-tariff-popup')]//button")
    protected Button confirmFutureTariffButton;
    /**
     *  тестовый блок содержащий сообщение об успешной отмене будущего тарифного плана
     */
    @FindBy(xpath = xPathFutureTariffBlock + "//div[contains(@class,'message')]/div[contains(@id,'revertResultSucces')]")
    protected TextBlock succesCancelFutureTariff;
    /**
     *  @return имя будущего тарифного плана
     */
    public String getFutureTariffName(){
        try {
            return futureTariffName.getText();
        }catch (NoSuchElementException e){
            throw new NoFutureTariffException("Будущий тарифный план отсутствует!" + e);
        }
    }
    /**
     * Отменить будущий тарифный план
     */
    public void cancelFutureTariff(){
        try {
            futureTariffCancel.click();
        }catch (NoSuchElementException e){
            throw new NoFutureTariffException("Будущий тарифный план отсутствует!" + e);
        }
        element(confirmFutureTariffButton.getWrappedElement()).waitUntilVisible().click();
        try {
            element(succesCancelFutureTariff.getWrappedElement()).waitUntilVisible();
        }catch (NoSuchElementException ex){
            throw new ChangeTariffException("Неудачная попытка отменить будущий тариф! " + ex);
        }
    }
    /**
     * Метод смены тарифа
     *
     * @param tariffName Имя тарифа для перехода
     */
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
                throw new ChangeTariffException("Неудачная попытка перехода на тариф [" + tariffName + "]");
            }
        }catch (NoSuchElementException ex){
            throw new TariffNotFoundException("Тариф " + tariffName + " не найден!");
        }
    }
    /**
     * Метод проверки активности кнопки перехода на тариф
     *
     * @return true если кнопка активна, в противном случае - false
     */
    public boolean checkEnabledButtonChangeTariff(String tariffName){
        WebElementFacade buttonChangeTariff = findBy("//div[@class='tariffs-list']/form//div[contains(@class,'info')]//h2[contains(text(),'" + tariffName + "')]//parent::div[contains(@class,'info')]//preceding-sibling::div[contains(@class,'switch')]//button");
        String ariaDisabled = buttonChangeTariff.getAttribute("aria-disabled");
        if(ariaDisabled.equals("true"))
            return false;
        else
            return true;
    }
}
