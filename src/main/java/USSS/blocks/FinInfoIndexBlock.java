package USSS.blocks;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Form;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.element.Button;
import java.awt.*;
import java.util.List;

/**
 * Created by KPodberezin on 19.09.2014.
 */
public class FinInfoIndexBlock extends HtmlElement implements Block {

    /**
     * Форма
     */
    @FindBy(id = "fininfoindexpage")
    private Form finInfoBlock;

    /**
     * Надпись "Заказать финансовый отчет"
     */
    @FindBy(xpath = "//form[@id =\"finInfoIndexPage\"]//div[contains(@class,\"call-details-params prepaid-fininfo-filter-right\")]/h3")
    private TextBlock tbHeadFinInfo;

    /**
     * Комбобокс выбора периода
     */
    @FindBy(xpath = "//form[contains(@id, 'finInfoIndexPage')]//div[contains(@class, 'row period')]")
    private WebElement cbPeriod;

    /**
     * Кнопка комбобокса выбора периода
     */
    @FindBy(xpath = "//span[contains(@class,'ui-icon ui-icon-triangle-1-s')]")
    private WebElement cbPeriodBtn;

    /**
     * Кнопка "Заказать детализацию"
     */
    @FindBy(xpath = "//button[contains(@id,'finInfoIndexPage')]")
    private Button btnGetDetail;

    /**
     * Ссылка "Ранее заказанные отчеты"
     */
    @FindBy(xpath = "//a")
    private Link linkReportHistory;


    public void selectPeriod(String period) {
        cbPeriodBtn.click();
        List<WebElement> cbElements = findElements(By.xpath("//form[contains(@id, 'finInfoIndexPage')]//button[contains(@id,'finInfoIndexPage')]"));
        for (WebElement wb : cbElements) {
            if (!wb.getText().contains(period)) {
                // exeption;
            }

        }
    }

    public void onClickBtnGetDetail() {
        btnGetDetail.click();
    }

    public void onClickLinkGetHistoryDetail() {
        linkReportHistory.click();
    }

    @Override
    public void VerifyAllElements() {
        //todo
    }
}
