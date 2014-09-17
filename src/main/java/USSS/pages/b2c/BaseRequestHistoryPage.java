package USSS.pages.b2c;

import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

public class BaseRequestHistoryPage extends BlockPageObject {
    public BaseRequestHistoryPage(WebDriver driver) {
        super(driver);
    }


    public HistoryRequestLine getLastRequest(){
       return new HistoryRequestLine(0);
    }
    public class HistoryRequestLine{
        private String xPathRequestLine;
        private HistoryRequestLine(int index) {
            xPathRequestLine = "//tbody[@id='formRequest:requestsTable_data']/tr[@data-ri = '" + index + "']";
        }

        public String getCreateDate(){
            return findBy(xPathRequestLine + "//span[@class='date']").getText();
        }
        public String getNumberRequest(){
            return findBy(xPathRequestLine + "//td[contains(@class,'column-block custom-heading')]//a").getText();
        }
        public String getMessage(){
            return findBy(xPathRequestLine + "//td[contains(@class,'column-block custom-heading')]").getText();
        }
        public String getStatus(){
            return findBy(xPathRequestLine + "//td[contains(@class,'status')]").getText();
        }
    }
}
