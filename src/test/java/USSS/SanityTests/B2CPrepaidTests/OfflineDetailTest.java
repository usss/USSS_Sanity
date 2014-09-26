package USSS.SanityTests.B2CPrepaidTests;

import USSS.Utils.SettingsTests;
import USSS.requirements.USSS_6_0_Sanity;
import USSS.steps.B2CPrepaidSteps.InteractionDetalisationSteps;
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
 * Created by KPodberezin on 22.09.2014.
 */

@RunWith(ThucydidesRunner.class)
@Story(USSS_6_0_Sanity.B2CPrepaid.ViewingPayments.class)

public class OfflineDetailTest {
    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://dev-web01:23001")
    public Pages pages;

    @Steps
    InteractionDetalisationSteps interactionDetalisationSteps;

    @Test
    public void check_display_payments_b2c_prep() throws IOException, ParseException {

        Map<String, String> settings = SettingsTests.getParametersForTest("check_display_payments_b2c_prep");

        String login = settings.get("LoginUser");
        String password = settings.get("PasswordUser");
        String startDate = settings.get("StartDate");
        String endDate = settings.get("EndDate");
     //   String startDateMax = settings.get("StartDateMax");
      //  String endDateMax = settings.get("EndDateMax");

        interactionDetalisationSteps.authorization(login, password);
        interactionDetalisationSteps.view_details_and_view_history();
        interactionDetalisationSteps.view_details_and_comfirm_period();
        interactionDetalisationSteps.select_detalisation_for_today();
        interactionDetalisationSteps.select_detalisation_for_last_week();
        interactionDetalisationSteps.select_detalisation_for_last_month();
       // interactionDetalisationSteps.select_detalisation_for_period(startDateMax, endDateMax);
        interactionDetalisationSteps.select_detalisation_for_period(startDate, endDate);
        interactionDetalisationSteps.view_page_save_report();
    }
}
