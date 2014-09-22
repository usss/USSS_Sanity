package USSS.pages.b2c;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

/**
 * Базовый pageObject страницы "Авторизация" для B2C postpaid и B2C prepaid клиентов
 */
@DefaultUrl("http://dev-web01:23001/login.html")
public class BaseLoginPage extends BlockPageObject {
    public BaseLoginPage(WebDriver driver) {
        super(driver);
    }
    /**
     * Поле ввода логина
     */
    @FindBy(id ="loginFormB2C:loginForm:login")
    private TextInput loginField;
    /**
     * Поле ввода пароля
     */
    @FindBy(id ="loginFormB2C:loginForm:password")
    private TextInput passwordFiled;
    /**
     * Кнопка "Вход"
     */
    @FindBy(id ="loginFormB2C:loginForm:loginButton")
    private Button loginButton;
    /**
     * Метод авторизации в ЛК
     *
     * @param login логин пользователя
     *
     * @param password пароль пользователя
     */
    public void authorization(String login, String password){
        loginField.sendKeys(login);
        passwordFiled.sendKeys(password);
        loginButton.click();
    }
}
