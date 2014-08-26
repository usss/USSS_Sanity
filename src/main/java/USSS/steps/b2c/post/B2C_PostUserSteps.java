package USSS.steps.b2c.post;

import USSS.pages.b2c.LoginB2CPage;
import USSS.pages.b2c.prep.ProfilePage;
import USSS.pages.b2c.prep.TariffsListPage;
import USSS.steps.b2c.GeneralB2CSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class B2C_PostUserSteps extends GeneralB2CSteps {
    public B2C_PostUserSteps(Pages pages) {super(pages); }

    @Step
    public void change_tariff(String tariffName){
        TariffsListPage tariffsListPage = getPages().get(TariffsListPage.class);
        tariffsListPage.changeTariff(tariffName);
    }



}
