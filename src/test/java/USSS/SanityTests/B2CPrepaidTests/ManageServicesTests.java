package USSS.SanityTests.B2CPrepaidTests;

import USSS.Utils.SettingsTests;
import USSS.requirements.USSS_6_0_Sanity;
import USSS.steps.B2CPrepaidSteps.ManageServicesSteps;
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
@Story(USSS_6_0_Sanity.B2CPrepaid.ManageServices.class)
public class ManageServicesTests {

    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://dev-web01:23001")
    public Pages pages;

    @Steps
    ManageServicesSteps manageServicesSteps;

    @Test
    public void check_enabled_service_b2c_prep() throws IOException, SQLException, ClassNotFoundException {
        Map<String,String> settings = SettingsTests.getParametersForTest("check_enabled_service_b2c_prep");

        String login = settings.get("LoginUser");
        String password = settings.get("PasswordUser");

        manageServicesSteps.authorization(login,password);
        manageServicesSteps.open_service_list();
        manageServicesSteps.set_filter_available_services();
        manageServicesSteps.select_random_cats_and_check_display_services();
        manageServicesSteps.enable_random_service_and_check_enable(login,password);
    }

    @Test
    public void check_disabled_service_b2c_prep() throws IOException, SQLException, ClassNotFoundException {
        Map<String,String> settings = SettingsTests.getParametersForTest("check_disabled_service_b2c_prep");

        String login = settings.get("LoginUser");
        String password = settings.get("PasswordUser");

        manageServicesSteps.authorization(login,password);
        manageServicesSteps.open_service_list();
        manageServicesSteps.set_filter_connected_services();
        manageServicesSteps.enable_random_service_and_check_enable(login,password);
    }
}
