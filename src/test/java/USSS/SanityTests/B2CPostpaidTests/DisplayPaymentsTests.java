package USSS.SanityTests.B2CPostpaidTests;


import USSS.Utils.SettingsTests;
import USSS.requirements.USSS_6_0_Sanity;
import USSS.steps.B2CPostpaidSteps.InteractionDetalisationSteps;
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

@RunWith(ThucydidesRunner.class)
@Story(USSS_6_0_Sanity.B2CPostpaid.ViewingPayments.class)

public class DisplayPaymentsTests {
    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://dev-web01:23001")
    public Pages pages;

    @Steps
    InteractionDetalisationSteps interactionDetalisationSteps;

    @Test
    public void check_display_payments_b2c_post() throws IOException, ParseException {

        Map<String,String> settings = SettingsTests.getParametersForTest("check_display_payments_b2c_post");

        String login = settings.get("LoginUser");
        String password = settings.get("PasswordUser");
        String startDate =  settings.get("StartDate");
        String endDate =  settings.get("EndDate");

        interactionDetalisationSteps.authorization(login, password);
        interactionDetalisationSteps.open_finance_and_details_page_and_check_page();
        interactionDetalisationSteps.check_filter_date(startDate, endDate);
        interactionDetalisationSteps.check_display_options_of_filter_by_type_payments();
        interactionDetalisationSteps.check_filter_type_payments();
        interactionDetalisationSteps.check_upload_excel_file();
    }

}
