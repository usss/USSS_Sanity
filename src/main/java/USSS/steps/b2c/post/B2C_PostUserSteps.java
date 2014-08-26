package USSS.steps.b2c.post;

import USSS.pages.b2c.LoginB2CPage;
import USSS.pages.b2c.prep.ProfilePage;
import USSS.pages.b2c.prep.TariffsListPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class B2C_PostUserSteps extends ScenarioSteps {
    public B2C_PostUserSteps(Pages pages) {super(pages); }

    @Step
    public void authorization(String login, String password){
        LoginB2CPage loginPage = getPages().get(LoginB2CPage.class);
        loginPage.open();
        loginPage.authorization(login, password);
    }
    @Step
    public void open_tariff_list(){
        ProfilePage profilePage = getPages().get(ProfilePage.class);
        profilePage.openTariffs();
    }
    @Step
    public void change_tariff(String tariffName){
        TariffsListPage tariffsListPage = getPages().get(TariffsListPage.class);
        tariffsListPage.changeTariff(tariffName);
    }



}
