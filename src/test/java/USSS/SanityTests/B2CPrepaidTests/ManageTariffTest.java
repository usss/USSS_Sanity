package USSS.SanityTests.B2CPrepaidTests;

import USSS.Utils.SettingsTests;
import USSS.requirements.USSS_6_0_Sanity;
import USSS.steps.B2CPrepaidSteps.ManageTariffsSteps;
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
@Story(USSS_6_0_Sanity.B2CPrepaid.ManageTariffPlans.class)
public class ManageTariffTest {

    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://dev-web01:23001")
    public Pages pages;

    @Steps
    ManageTariffsSteps manageTariffsSteps;

    @Test
    public void change_tariff_b2c_prep_with_positive_balance() throws SQLException, IOException, ClassNotFoundException, InterruptedException {

        Map<String,String> settings =  SettingsTests.getParametersForTest("change_tariff_b2c_prep_with_positive_balance");

        String login = settings.get("LoginUser");
        String password = settings.get("PasswordUser");
        String tariffName = settings.get("ChangeTariff");

        manageTariffsSteps.authorization(login, password);
        manageTariffsSteps.open_tariff_list();
        manageTariffsSteps.check_display_tariffs(login);
        manageTariffsSteps.change_tariff_and_check_change(login,password,tariffName);
        manageTariffsSteps.logout();
    }

    @Test
    public void change_tariff_b2c_prep_with_negative_balance() throws IOException {

        Map<String,String> settings =  SettingsTests.getParametersForTest("change_tariff_b2c_prep_with_negative_balance");

        String login = settings.get("LoginUser");
        String password = settings.get("PasswordUser");
        String tariffName = settings.get("ChangeTariff");

        manageTariffsSteps.authorization(login, password);
        manageTariffsSteps.open_tariff_list();
        manageTariffsSteps.change_tariff_with_negative_balance(tariffName);
        manageTariffsSteps.logout();
    }
    @Test
    public void check_display_non_null_price_of_tariff_for_b2c_prepaid(){
        manageTariffsSteps.authorization("sel_9687013119_pre","FRol370026vf");
        manageTariffsSteps.check_test();
    }
}
