package USSS.SanityTests;

import USSS.requirements.USSS_6_0_Sanity;
import USSS.steps.GeneralSteps;
import USSS.steps.b2c.GeneralB2CSteps;
import USSS.steps.b2c.post.B2C_PostUserSteps;
import USSS.steps.b2c.prep.B2C_PrepUserSteps;
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

@RunWith(ThucydidesRunner.class)
@Story(USSS_6_0_Sanity.B2C_ManageBPlan.B2C_ChangeBPlanPost.class)
public class ChangeTariff_B2C_PostTest {

    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://dev-web01:23001")
    public Pages pages;

    @Steps
    B2C_PostUserSteps B2CSteps;

    @Test
    public void change_tariff() throws SQLException, IOException, ClassNotFoundException, InterruptedException {

        String login = "sel_9030339830_post";
        String password = "FRol370026vf";

        B2CSteps.authorization(login,password);
        B2CSteps.open_tariff_list();
        //B2CSteps.check_display_tariffs();
        B2CSteps.change_tariff_and_check_change(login, password);
        B2CSteps.cancel_future_tariff();
        B2CSteps.logout();
        B2CSteps.e2e_null_transaction();
        B2CSteps.authorization(login,password);

    }

}
