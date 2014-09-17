package USSS.steps;

import USSS.pages.b2c.BaseLoginPage;
import USSS.pages.b2c.BaseProfilePage;
import USSS.pages.b2c.BaseTariffsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

public abstract class AbstractB2CSteps extends BaseSteps {
    public AbstractB2CSteps(Pages pages) {super(pages); }

    @Step
    public void authorization(String login, String password){
        BaseLoginPage loginPage = getPages().get(BaseLoginPage.class);
        loginPage.open();
        loginPage.authorization(login, password);
    }
    @Step
    public void logout(){
        BaseTariffsPage tariffsListPage = getPages().get(BaseTariffsPage.class);
        tariffsListPage.navigationMenu.logOut();
    }
    @Step
    public void open_tariff_list(){
        BaseProfilePage profilePage = getPages().get(BaseProfilePage.class);
        profilePage.navigationMenu.openTariffs();
    }
    @Step
    public void open_service_list(){
        BaseProfilePage profilePage = getPages().get(BaseProfilePage.class);
        profilePage.navigationMenu.openSocs();
    }
    @Step
    public void open_request_history(){
        BaseProfilePage profilePage = getPages().get(BaseProfilePage.class);
        profilePage.navigationMenu.openHistoryRequest();
    }
    @Step
    public void open_finance_and_detail(){
        BaseProfilePage profilePage = getPages().get(BaseProfilePage.class);
        profilePage.navigationMenu.openFinanceAndDetail();
    }


}
