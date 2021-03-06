package USSS.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

import static ch.lambdaj.Lambda.extract;
import static ch.lambdaj.Lambda.on;

public class CatsFiltersBlock extends HtmlElement implements Block{

    private static final String xPathListCats = "//div[contains(@class,'item-cat')]/a/span";

    @FindBy(xpath = xPathListCats)
    private List<WebElement> listCats;

    public void selectCats(String... catsName){
        for (String cat : catsName ){
            try {
                String cssClass = findElement(By.xpath("//span[contains(text(),'" + cat + "')]//ancestor::div[contains(@class,'item-cat')]")).getAttribute("class");
                if(!cssClass.contains("selected")){
                    findElement(By.xpath(xPathListCats + "[contains(text(),'" + cat + "')]")).click();

                }
            }catch (NoSuchElementException e){
                throw new NoSuchElementException("Фильтр [" + cat + "] не найден!");
            }
        }
    }
    public void unSelectCats(String... catsName){
        for (String cat : catsName ){
            try {
                String cssClass = findElement(By.xpath("//span[contains(text(),'" + cat + "')]//ancestor::div[contains(@class,'item-cat')]")).getAttribute("class");
                if(cssClass.contains("selected")){
                    findElement(By.xpath(xPathListCats + "[contains(text(),'" + cat + "')]")).click();
                }
            }catch (NoSuchElementException e){
                throw new NoSuchElementException("Фильтр [" + cat + "] не найден!");
            }
        }
    }
    public List<String> getListCats(){
        return extract(listCats, on(WebElement.class).getText());
    }

    @Override
    public void VerifyAllElements() {
        //todo
    }
}
