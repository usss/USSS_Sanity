package USSS.SanityTests;

import USSS.requirements.USSS_6_0_Sanity;
import USSS.steps.GeneralSteps;
import USSS.steps.b2c.GeneralB2CSteps;
import USSS.steps.b2c.prep.B2C_PrepUserSteps;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;

import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.sql.SQLException;

@RunWith(ThucydidesRunner.class)
//@UseTestDataFrom("test-data/categories.csv")
@Story(USSS_6_0_Sanity.B2C_ManageBPlan.B2C_ChangeBPlanPrep.class)
public class ChangeTariff_B2C_PrepTest {

    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://dev-web01:23001")
    public Pages pages;

    @Steps
    GeneralSteps generalSteps;
    @Steps
    GeneralB2CSteps generalB2CSteps;
    @Steps
    B2C_PrepUserSteps B2CSteps;

    @Test
    public void change_tariff_with_positive_balance() throws SQLException, IOException, ClassNotFoundException, InterruptedException {

        String login = "sel_9687013119_pre";
        String password = "FRol370026vf";

        generalB2CSteps.authorization(login, password);
        generalB2CSteps.open_tariff_list();
        B2CSteps.check_display_tariffs();
        B2CSteps.change_tariff_and_check_change(login,password);
        generalB2CSteps.logout();
    }
    @Test
    public void change_tariff_with_negative_balance(){

        String login = "9687013118";
        String password = "Qwerty4$";

        generalB2CSteps.authorization(login, password);
        generalB2CSteps.open_tariff_list();
        B2CSteps.change_tariff_with_negative_balance();
        generalB2CSteps.logout();
    }
}
