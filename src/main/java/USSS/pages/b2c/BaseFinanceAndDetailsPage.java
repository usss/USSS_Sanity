package USSS.pages.b2c;

import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

/**
 * Базовый pageObject страницы "Финансы и Детализация" для B2C postpaid и B2C prepaid клиентов
 */
public class BaseFinanceAndDetailsPage extends BlockPageObject {
    public BaseFinanceAndDetailsPage(WebDriver driver) {
        super(driver);
    }
}
