package USSS.pages.b2b.post.ple;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

/**
 * Created by KPodberezin on 26.09.2014.
 */
public class GeniralPage extends BlockPageObject {

    public GeniralPage(WebDriver driver) {
        super(driver);
    }


    /**
     * кнопка Управление контрактом
     */
    @FindBy(xpath = "//a[contains(@id,'navCatalog') and contains(text(),'Управление контрактом')]")
    private Link btnManagerContract;


    public  void  onClickManagerContract() {
        btnManagerContract.click();
        waitFor("//h2[contains(text(),'Список абонентов')]");
    }
}
