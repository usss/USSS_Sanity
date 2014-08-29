package USSS.SanityTests;

import USSS.Utils.SettingsTests;
import USSS.requirements.USSS_6_0_Sanity;
import USSS.steps.b2c.prep.ManageTariffsSteps;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;

import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

@RunWith(ThucydidesRunner.class)
@Story(USSS_6_0_Sanity.B2C_ManageBPlan.B2C_ChangeBPlanPrep.class)
public class ChangeTariff_B2C_PrepTest {

    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://dev-web01:23001")
    public Pages pages;

    @Steps
    ManageTariffsSteps B2CSteps;

    @Test
    public void change_tariff_with_positive_balance() throws SQLException, IOException, ClassNotFoundException, InterruptedException {

        Map<String,String> settings =  SettingsTests.getParametersForTest("change_tariff_with_positive_balance");

        String login = settings.get("LoginUser");
        String password = settings.get("PasswordUser");
        String tariffName = settings.get("ChangeTariff");

        B2CSteps.authorization(login, password);
        B2CSteps.open_tariff_list();
        B2CSteps.check_display_tariffs(login);
        B2CSteps.change_tariff_and_check_change(login,password,tariffName);
        B2CSteps.logout();
    }
    @Test
    public void change_tariff_with_negative_balance() throws IOException {

        Map<String,String> settings =  SettingsTests.getParametersForTest("change_tariff_with_negative_balance");

        String login = settings.get("LoginUser");
        String password = settings.get("PasswordUser");
        String tariffName = settings.get("ChangeTariff");

        B2CSteps.authorization(login, password);
        B2CSteps.open_tariff_list();
        B2CSteps.change_tariff_with_negative_balance(tariffName);
        B2CSteps.logout();
    }
}
