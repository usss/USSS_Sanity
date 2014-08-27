package USSS.steps;

import USSS.Utils.DataBaseUtils;
import USSS.Utils.ReadConfiguration;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import java.io.IOException;
import java.sql.SQLException;


public class GeneralSteps extends ScenarioSteps {
    public GeneralSteps(Pages pages) {super(pages); }

    @Step
    public void e2e_null_transaction() throws IOException, SQLException, ClassNotFoundException {
        String strInsert = "INSERT INTO CSM_TRANSACTIONS (TRX_SEQ_NO,ACTV_CODE,BAN,SUBSCRIBER_NO,SYS_CREATION_DATE)" +
                "values(csm_transactions_1sq.nextval,'CIW',1,'0000000000', sysdate)";
        ReadConfiguration conf = new ReadConfiguration("RUS.properties");
        DataBaseUtils db = new DataBaseUtils(conf.getDataBase(), conf.getHost(), conf.getPort(),conf.getUserName(), conf.getUserPass());
        db.insert(strInsert);
        db.close();
    }
}
