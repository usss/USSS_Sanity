package USSS.blocks;

import net.thucydides.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

public class BalanceBlock extends HtmlElement implements Block {

    /**
     * Текстовый блок баланса
     */
    @FindBy(xpath = "//span[contains(@class,'price')]")
    private WebElement balanceText;
    /**
     * Обновить баланс
     */
    @FindBy(xpath = "//div[contains(@class,'update-ctn-balance update-link')]/a")
    private Link updateBalanceLink;
    /**
     *
     * @return значение баланса
     */
    public String getBalance(){
        return balanceText.getText();
    }
    /**
     * Метод обновления баланса
     */
    public void updateBalance(){
        updateBalanceLink.click();
    }

    @Override
    public void VerifyAllElements() {
        balanceText.isEnabled();
        updateBalanceLink.isEnabled();
    }
}
