package USSS.SanityTests;

import USSS.Utils.SettingsTests;
import USSS.requirements.USSS_6_0_Sanity;
import USSS.steps.b2c.post.ManageTariffsB2CPostSteps;
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
@Story(USSS_6_0_Sanity.B2C_ManageBPlan.B2C_ChangeBPlanPost.class)
public class ChangeTariff_B2C_PostTest {

    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://dev-web01:23001")
    public Pages pages;

    @Steps
    ManageTariffsB2CPostSteps B2CSteps;

    @Test
    public void change_tariff() throws SQLException, IOException, ClassNotFoundException, InterruptedException {

        Map<String,String> settings =  SettingsTests.getParametersForTest("change_tariff");

        String login = settings.get("LoginUser");
        String password = settings.get("PasswordUser");
        String tariffName = settings.get("ChangeTariff");

        B2CSteps.authorization(login,password);
        B2CSteps.open_tariff_list();
        B2CSteps.check_display_tariffs(login);
        B2CSteps.change_tariff_and_check_change(login, password,tariffName);
        B2CSteps.check_disable_buttons_change_tariff();
        B2CSteps.cancel_future_tariff();
        B2CSteps.logout();
        B2CSteps.e2e_null_transaction();
        Thread.sleep(15000);
        B2CSteps.authorization(login,password);
        B2CSteps.open_tariff_list();
        B2CSteps.check_cancel_future_tariff();
        B2CSteps.logout();
    }
}
