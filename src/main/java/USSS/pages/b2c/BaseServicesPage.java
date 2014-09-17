package USSS.pages.b2c;

import USSS.blocks.HeaderFilterServices;
import USSS.pages.Exceptions.ConnectionSOCsException;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

import java.util.ArrayList;
import java.util.List;

import static ch.lambdaj.Lambda.extract;
import static ch.lambdaj.Lambda.on;


public class BaseServicesPage extends BlockPageObject {
    public BaseServicesPage(WebDriver driver) {
        super(driver);
    }

    private static final String XPATH_LIST_CATS = "//div[contains(@class,'item-cat')]/a/span";

    @FindBy(xpath = "//form[@id='filterForm']")
    public HeaderFilterServices filterSOCs;

    @FindBy(xpath = XPATH_LIST_CATS)
    private List<WebElement> listCats;

    public void selectCats(String... catsName){
        for (String cat : catsName ){
            String xPathItemCat = "//span[contains(text(),'" + cat + "')]//ancestor::div[contains(@class,'item-cat')]";
            String xPathSelectedCat = "//h2[contains(@class,'selected-categories') and contains(text(),'" + cat + "')]";
            try {
                String cssClass = findBy(xPathItemCat).getAttribute("class");
                if(!cssClass.contains("selected")){
                    findBy(xPathItemCat + "/a/span").click();
                    waitFor(xPathSelectedCat);
                }
            }catch (NoSuchElementException e){
                throw new NoSuchElementException("Фильтр [" + cat + "] не найден!");
            }
        }
    }
    public void unSelectCats(String... catsName){
        for (String cat : catsName ){
            String xPathItemCat = "//span[contains(text(),'" + cat + "')]//ancestor::div[contains(@class,'item-cat')]";
            String xPathSelectedCat = "//h2[contains(@class,'selected-categories') and contains(text(),'" + cat + "')]";
            try {
                String cssClass = findBy(xPathItemCat).getAttribute("class");
                if(cssClass.contains("selected")){
                    findBy(xPathItemCat + "/a/span").click();
                    waitFor(xPathSelectedCat);
                }
            }catch (NoSuchElementException e){
                throw new NoSuchElementException("Фильтр [" + cat + "] не найден!");
            }
        }
    }
    public List<String> getListCats(){
        return extract(listCats, on(WebElement.class).getText());
    }
    public List<String> getListServices(){

        String xPathListSOCs = "//div[contains(@class,'service-item')]//h2";
        setWaitForTimeout(15000);
        List<String> res = new ArrayList<>();
        List<WebElementFacade> listSocsBlock2 = findAll(xPathListSOCs);

        for (WebElementFacade elem : listSocsBlock2){
            res.add(elem.waitUntilVisible().getText());
        }
        return res;
    }
    public List<String> getListServicesSwitchTrue(){

        String xPathListSOCs = "//div[contains(@class,'service-item')]//div[contains(@class,'switch')]//button[@aria-disabled='false']//ancestor::div[contains(@class,'switch switch')]//following-sibling::div[contains(@class,'info')]//h2";
        setWaitForTimeout(15000);
        List<String> res = new ArrayList<>();
        List<WebElementFacade> listSocsBlock2 = findAll(xPathListSOCs);

        for (WebElementFacade elem : listSocsBlock2){
            res.add(elem.waitUntilVisible().getText());
        }
        return res;
    }
    public String getCategoryService(String service){
        setWaitForTimeout(15000);
        return findBy("//h2[contains(text(),'" + service + "')]//ancestor::div[contains(@class,'info')]//ancestor::div[contains(@class,'service-item')]//div[contains(@class,'categories')]/a").getText();
    }
    public void enableService(String service){
        setWaitForTimeout(15000);

        String xPathBlockSoc = "//h2[contains(text(),'" + service + "')]//ancestor::div[contains(@class,'info')]//ancestor::div[contains(@class,'service-item')]";
        String xPathEnableButton = xPathBlockSoc + "//div[contains(@class,'switch')]//button";
        String xPathConnectedButton = xPathBlockSoc + "//div[contains(@class,'service-edit')]//div[contains(@class,'dashed-block')]//div[contains(@class,'row buttons')]//button/span[contains(text(),'Подключить')]";
        String xPathParameterPhNumber = "//div[contains(text(),'Номер для добавления:')]//ancestor::div[contains(@class,'common-form')]";
        String xPathSuccessMessage = xPathBlockSoc + "//div[contains(@class,'dashed-block message-single')]";

        WebElementFacade enableButton = null;
        try {
            enableButton = findBy(xPathEnableButton);
        }catch (NoSuchElementException e){
            throw new ConnectionSOCsException("Услуг [" + service + "] отсутствует в списке");
        }
        if (enableButton.getAttribute("aria-disabled").equals("false")) {
            enableButton.click();
            waitFor(xPathConnectedButton);
            findBy(xPathConnectedButton).click();
            waitFor(xPathSuccessMessage);
        }else
            throw new ConnectionSOCsException("Услуга ["  + service + "] присутствует в списке, но недоступна для подключения!");
    }
    public void disableService(String service){
        setWaitForTimeout(20000);

        String xPathBlockSoc = "//h2[contains(text(),'" + service + "')]//ancestor::div[contains(@class,'info')]//ancestor::div[contains(@class,'service-item')]";
        String xPathEnableButton = xPathBlockSoc + "//div[contains(@class,'switch')]//button";
        String xPathConnectedButton = xPathBlockSoc + "//div[contains(@class,'service-edit')]//div[contains(@class,'dashed-block')]//div[contains(@class,'row buttons')]//button/span[contains(text(),'Отключить')]";
        String xPathSuccessMessage = xPathBlockSoc + "//div[contains(@class,'dashed-block message-single')]";

        WebElementFacade enableButton = null;
        try {
            enableButton = findBy(xPathEnableButton);
        }catch (NoSuchElementException e){
            throw new ConnectionSOCsException("Услуга [" + service + "] отсутствует в списке");
        }
        if (enableButton.getAttribute("aria-disabled").equals("false")) {
            enableButton.click();
            waitFor(xPathConnectedButton);
            findBy(xPathConnectedButton).click();
            waitFor(xPathSuccessMessage);
        }else
            throw new ConnectionSOCsException("Услуга ["  + service + "] присутствует в списке, но не может быть отключена!");
    }
}
