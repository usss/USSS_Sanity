package USSS.blocks;

import net.thucydides.core.annotations.findby.FindBy;
import ru.yandex.qatools.htmlelements.element.Form;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextBlock;

/**
 * Created by KPodberezin on 22.09.2014.
 */
public class FinDetailTable extends HtmlElement {

    /**
     * Форма
     */
    @FindBy(id = "finInfoIndexPage")
    private Form finInfoBlock;

    /**
     * Надпись "Ваши расходы"
     */
    @FindBy(xpath = "//form[contains(@id, 'finInfoIndexPage')]//div[contains(@class,'balance-table')]/h3")
    private TextBlock tbHeadbalansTable;
    /**
     * Таблица "Ваши расходы"
     */
    @FindBy(xpath = "//form[contains(@id, 'finInfoIndexPage')]//div[contains(@class,'ui-datatable-tablewrapper')]")
    private TextBlock tblBalans;


    /**
     * Надпись "Детализация оказанных услуг"
     */
    @FindBy(xpath = "//form[contains(@id, 'finInfoIndexPage')]//div[contains(@class,'detalization')]/h3")
    private TextBlock tbHeadDetail;

}