package USSS.SanityTests.B2BPleTests;

import USSS.Utils.SettingsTests;
import USSS.requirements.USSS_6_0_Sanity;
import USSS.steps.B2BPleSteps.ManagerNumberSteps;
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
import java.text.ParseException;
import java.util.Map;

/**
 * Created by KPodberezin on 26.09.2014.
 */
@RunWith(ThucydidesRunner.class)
@Story(USSS_6_0_Sanity.B2CPrepaid.ViewingPayments.class)
public class ManagerDetailsTest {

    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://dev-web01:23001")
    public Pages pages;

    @Steps
    ManagerNumberSteps managerNumberSteps;


    @Test
    public void detalization_current_period_number_b2bpost() throws IOException, ParseException {

        Map<String, String> settings = SettingsTests.getParametersForTest("check_display_payments_b2c_prep");

        String login = "NBL_9684029090ple";
        String password = "Qwerty4$";
        String startDate = settings.get("StartDate");
        String endDate = settings.get("EndDate");
        //  String startDateMax = settings.get("StartDateMax");
        //  String endDateMax = settings.get("EndDateMax");

        managerNumberSteps.authorization(login, password);
        managerNumberSteps.open_manager_contract_page();
    }
}
