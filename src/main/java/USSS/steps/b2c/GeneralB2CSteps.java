package USSS.steps.b2c;

import USSS.pages.b2c.LoginB2CPage;
import USSS.pages.b2c.ProfileB2CPage;
import USSS.pages.b2c.TariffsListB2CPage;
import USSS.steps.GeneralSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

public abstract class GeneralB2CSteps extends GeneralSteps {
    public GeneralB2CSteps(Pages pages) {super(pages); }

    @Step
    public void authorization(String login, String password){
        LoginB2CPage loginPage = getPages().get(LoginB2CPage.class);
        loginPage.open();
        loginPage.authorization(login, password);
    }
    @Step
    public void logout(){
        TariffsListB2CPage tariffsListPage = getPages().get(TariffsListB2CPage.class);
        tariffsListPage.headerMenu.logOut();
    }
    @Step
    public void open_tariff_list(){
        ProfileB2CPage profilePage = getPages().get(ProfileB2CPage.class);
        profilePage.openTariffs();
    }

}
