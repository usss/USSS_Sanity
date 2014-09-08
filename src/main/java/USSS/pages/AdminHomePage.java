package USSS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

public class AdminHomePage extends BlockPageObject {
    public AdminHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class,'block-padding buttons-set')]/a/span[contains(text(),'Создать Telco администратора')]")
    private WebElement createTelcoAdmin;

    @FindBy(xpath = "//div[contains(@class,'block-padding buttons-set')]/a/span[contains(text(),'Создать корпоративного администратора')]")
    private WebElement createCorporateAdmin;
}
