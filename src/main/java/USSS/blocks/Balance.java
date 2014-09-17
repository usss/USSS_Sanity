package USSS.blocks;

import net.thucydides.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

public class Balance extends HtmlElement {

    @FindBy(xpath = "//span[contains(@class,'price')]")
    private WebElement balanceText;

    @FindBy(xpath = "//div[contains(@class,'update-ctn-balance update-link')]/a")
    private Link updateBalanceLink;

    public String getBalance(){
        return balanceText.getText();
    }
    public void updateBalance(){
        updateBalanceLink.click();
    }
}
