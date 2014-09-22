package USSS.pages.b2c;

import net.thucydides.core.annotations.findby.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;
/**
 * Базовый pageObject страницы "История запросов" для B2C postpaid и B2C prepaid клиентов
 */
public class BaseRequestHistoryPage extends BlockPageObject {
    public BaseRequestHistoryPage(WebDriver driver) {
        super(driver);
    }

    public HistoryRequestLine getLastRequest(){
       return new HistoryRequestLine(0);
    }
    /**
     * Класс строки таблицы запросов
     */
    public class HistoryRequestLine{
        private String xPathRequestLine;
        /**
         * @param index индекс строки в таблице (нумерация начинается с 0)
         */
        private HistoryRequestLine(int index) {
            xPathRequestLine = "//tbody[@id='formRequest:requestsTable_data']/tr[@data-ri = '" + index + "']";
        }
        /**
         * @return дата создания запроса, в том формате, котором отображается в интерфейсе ЛК
         */
        public String getCreateDate(){
            return findBy(xPathRequestLine + "//span[@class='date']").getText();
        }
        /**
         * @return номер запроса
         */
        public String getNumberRequest(){
            return findBy(xPathRequestLine + "//td[contains(@class,'column-block custom-heading')]//a").getText();
        }
        /**
         * @return сообщение запроса
         */
        public String getMessage(){
            return findBy(xPathRequestLine + "//td[contains(@class,'column-block custom-heading')]").getText();
        }
        /**
         * @return статус запроса
         */
        public String getStatus(){
            return findBy(xPathRequestLine + "//td[contains(@class,'status')]").getText();
        }


        /**
         * Фильтр истории запросов, номер
         */
        @FindBy(xpath = "//input[contains(@id, 'formRequest:requestsTable:requestId')]")
        private WebElement tbNumberFiltr;

        @FindBy(xpath = "//label[contains(@id, 'formRequest:requestsTable:requestTypeId_label')]")
        private WebElement lbCurrentSelectTypeFiltr;

        @FindBy(xpath = "//label[contains(@id, 'formRequest:requestsTable:requestStatus_label')]")
        private WebElement lbCurrentSelectStatusFiltr;

    }
}
