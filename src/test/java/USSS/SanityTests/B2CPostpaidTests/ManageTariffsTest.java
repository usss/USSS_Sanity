package USSS.SanityTests.B2CPostpaidTests;

import USSS.Utils.SettingsTests;
import USSS.requirements.USSS_6_0_Sanity;
import USSS.steps.B2CPostpaidSteps.ManageTariffsSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

@RunWith(ThucydidesRunner.class)
@Story(USSS_6_0_Sanity.B2CPostpaid.ManageTariffPlans.class)
public class ManageTariffsTest {
    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://dev-web01:23001")
    public Pages pages;

    @Steps
    ManageTariffsSteps manageTariffsSteps;

    @Test
    public void change_tariff_b2c_post() throws SQLException, IOException, ClassNotFoundException, InterruptedException {

        Map<String,String> settings =  SettingsTests.getParametersForTest("change_tariff_b2c_post");

        String login = settings.get("LoginUser");
        String password = settings.get("PasswordUser");
        String tariffName = settings.get("ChangeTariff");

        manageTariffsSteps.authorization(login,password);
        manageTariffsSteps.open_tariff_list();
        manageTariffsSteps.check_display_tariffs(login);
        manageTariffsSteps.change_tariff_and_check_change(login, password,tariffName);
        manageTariffsSteps.check_disable_buttons_change_tariff();
        manageTariffsSteps.cancel_future_tariff();
        manageTariffsSteps.logout();
        manageTariffsSteps.e2e_null_transaction();
        Thread.sleep(15000);
        manageTariffsSteps.authorization(login,password);
        manageTariffsSteps.open_tariff_list();
        manageTariffsSteps.check_cancel_future_tariff();
        manageTariffsSteps.logout();
    }
}
