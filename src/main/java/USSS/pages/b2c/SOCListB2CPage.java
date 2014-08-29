package USSS.pages.b2c;


import USSS.pages.Exceptions.ConnectionSOCsException;
import USSS.pages.b2c.prep.blocksB2Cprep.CatsFilterSOCs;
import USSS.pages.b2c.prep.blocksB2Cprep.HeaderFilterSOCs;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

import java.util.List;

import static ch.lambdaj.Lambda.extract;
import static ch.lambdaj.Lambda.on;


public class SOCListB2CPage extends BlockPageObject {
    public SOCListB2CPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//form[@id='filterForm']")
    public HeaderFilterSOCs filterSOCs;

    @FindBy(xpath = "//form[contains(@id,'catsForm')]")
    public CatsFilterSOCs catsFilterSOCs;

    @FindBy(xpath = "//div[contains(@class,'service-item')]//h2")
    public List<WebElement> listSocsBlock;

    public List<String> getListSOCs(){
        return extract(listSocsBlock, on(WebElement.class).getText());
    }

    public String getCategoriesForSOC(String soc){
        setWaitForTimeout(15000);
        return findBy("//h2[contains(text(),'" + soc + "')]//ancestor::div[contains(@class,'info')]//ancestor::div[contains(@class,'service-item')]//div[contains(@class,'categories')]/a").getText();
    }
    public void enableNotParameterizedSoc(String soc){
        WebElementFacade enableButton = null;
        setWaitForTimeout(15000);
        try {
            enableButton = findBy("//h2[contains(text(),'" + soc + "')]//ancestor::div[contains(@class,'info')]//ancestor::div[contains(@class,'service-item')]//div[contains(@class,'switch')]//button");
        }catch (Exception e){
            throw new ConnectionSOCsException("Услуг [" + soc + "] отсутствует в списке");
        }
        if (enableButton.getAttribute("aria-disabled").equals("false")) {
            enableButton.click();
            String xPathConnectedButton = "//h2[contains(text(),'" + soc + "')]//ancestor::div[contains(@class,'info')]//ancestor::div[contains(@class,'service-item')]//div[contains(@class,'service-edit')]//div[contains(@class,'dashed-block')]//div[contains(@class,'row buttons')]//button/span[contains(text(),'Подключить')]";
            waitFor(xPathConnectedButton);
            findBy(xPathConnectedButton).click();
            waitFor("//h2[contains(text(),'" + soc + "')]//ancestor::div[contains(@class,'info')]//ancestor::div[contains(@class,'service-item')]//div[contains(@class,'dashed-block message-single')]");
        }else
            throw new ConnectionSOCsException("Услуга ["  + soc + "] присутствует в списке, но недоступна для подключения!");
    }




}
