package USSS.pages.b2c;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;


@DefaultUrl("http://dev-web01:23001/login.html")
public class BaseLoginPage extends BlockPageObject {

    @FindBy(id ="loginFormB2C:loginForm:login")
    private TextInput loginField;

    @FindBy(id ="loginFormB2C:loginForm:password")
    private TextInput passwordFiled;

    @FindBy(id ="loginFormB2C:loginForm:loginButton")
    private Button loginButton;

    public BaseLoginPage(WebDriver driver) {
        super(driver);
    }

    public void authorization(String login, String password){
        loginField.sendKeys(login);
        passwordFiled.sendKeys(password);
        loginButton.click();
    }
}
