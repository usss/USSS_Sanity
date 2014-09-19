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
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Map;

@RunWith(ThucydidesRunner.class)
@Story(USSS_6_0_Sanity.B2CPrepaid.ViewingPayments.class)

public class DisplayPaymentsTest {
    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://dev-web01:23001")
    public Pages pages;

    @Steps
    InteractionDetalisationSteps interactionDetalisationSteps;

    @Test
    public void check_display_payments_b2c_prep() throws IOException, ParseException {

        Map<String,String> settings = SettingsTests.getParametersForTest("check_display_payments_b2c_prep");

        String login = settings.get("LoginUser");
        String password = settings.get("PasswordUser");
        String startDate =  settings.get("StartDate");
        String endDate =  settings.get("EndDate");

        interactionDetalisationSteps.authorization(login, password);
        interactionDetalisationSteps.open_finance_and_details_page_and_check_page();
        interactionDetalisationSteps.check_filter_date(startDate, endDate);
        interactionDetalisationSteps.check_display_options_of_filter_by_type_payments();
        interactionDetalisationSteps.check_filter_type_payments();
        interactionDetalisationSteps.delete_filter_by_payment_type();
        interactionDetalisationSteps.check_upload_excel_file();
    }
    @Test
    public void test() throws SQLException, IOException, ClassNotFoundException {
        interactionDetalisationSteps.e2e_null_transaction();
    }
}
