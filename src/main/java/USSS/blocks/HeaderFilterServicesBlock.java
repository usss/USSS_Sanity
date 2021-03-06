package USSS.blocks;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

public class HeaderFilterServicesBlock extends HtmlElement implements Block{

    @FindBy(xpath = "//a[contains(@id,'filterForm')]//span[contains(text(), 'Все услуги')]")
    private Link allSOCs;

    @FindBy(xpath = "//a[contains(@id,'filterForm')]//span[contains(text(), 'Подключённые')]")
    private Link connectedSOCs;

    @FindBy(xpath = "//a[contains(@id,'filterForm')]//span[contains(text(), 'Доступные')]")
    private Link availableSOCs;

    public void openAllSOCs(){
        allSOCs.click();
    }
    public void openConnectedSOCs(){
        connectedSOCs.click();
    }
    public void openAvailableSOCs(){
        availableSOCs.click();
    }

    @Override
    public void VerifyAllElements() {
        allSOCs.isEnabled();
        connectedSOCs.isEnabled();
        availableSOCs.isEnabled();
    }
}
