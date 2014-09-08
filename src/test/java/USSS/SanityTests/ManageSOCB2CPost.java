package USSS.SanityTests;

import USSS.Utils.SettingsTests;
import USSS.requirements.USSS_6_0_Sanity;
import USSS.steps.b2c.post.ManageSocB2CPostSteps;
import USSS.steps.b2c.prep.ManageSocB2CPrepSteps;
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
@Story(USSS_6_0_Sanity.B2C_ManageSOC.B2C_ManageSOCPost.class)
public class ManageSOCB2CPost {

    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://dev-web01:23001")
    public Pages pages;

    @Steps
    ManageSocB2CPostSteps B2CSteps;

    @Test
    public void check_enabled_soc_b2c_post() throws IOException, SQLException, ClassNotFoundException {
        Map<String,String> settings = SettingsTests.getParametersForTest("check_enabled_soc_b2c_post");

        String login = settings.get("LoginUser");
        String password = settings.get("PasswordUser");

        B2CSteps.authorization(login,password);
        B2CSteps.open_socs_list();
        B2CSteps.set_filter_available_SOCs();
        B2CSteps.select_random_cats_and_check_display_SOCs();
        B2CSteps.enable_random_soc_and_check_enable(login,password);
    }
    @Test
    public void check_disabled_soc_b2c_post() throws IOException, SQLException, ClassNotFoundException {
        Map<String,String> settings = SettingsTests.getParametersForTest("check_disabled_soc_b2c_post");

        String login = settings.get("LoginUser");
        String password = settings.get("PasswordUser");

        B2CSteps.authorization(login,password);
        B2CSteps.open_socs_list();
        B2CSteps.set_filter_connected_SOCs();
        B2CSteps.disable_random_soc_and_check_disable(login,password);
    }
}
