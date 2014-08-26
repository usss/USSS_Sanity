package USSS.steps.b2c;

import USSS.Utils.DataBaseUtils;
import USSS.Utils.ReadConfiguration;
import USSS.pages.b2c.LoginB2CPage;
import USSS.pages.b2c.prep.ProfilePage;
import USSS.pages.b2c.prep.TariffsListPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import java.io.IOException;
import java.sql.SQLException;

public class GeneralB2CSteps extends ScenarioSteps {
    public GeneralB2CSteps(Pages pages) {super(pages); }

    @Step
    public void authorization(String login, String password){
        LoginB2CPage loginPage = getPages().get(LoginB2CPage.class);
        loginPage.open();
        loginPage.authorization(login, password);
    }
    @Step
    public void logout(){
        TariffsListPage tariffsListPage = getPages().get(TariffsListPage.class);
        tariffsListPage.headerMenu.logOut();
    }
    @Step
    public void open_tariff_list(){
        ProfilePage profilePage = getPages().get(ProfilePage.class);
        profilePage.openTariffs();
    }

}
