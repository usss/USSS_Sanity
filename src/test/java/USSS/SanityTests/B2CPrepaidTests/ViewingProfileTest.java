package USSS.SanityTests.B2CPrepaidTests;

import USSS.Utils.SettingsTests;
import USSS.requirements.USSS_6_0_Sanity;
import USSS.steps.B2CPrepaidSteps.ManageBalanceSteps;
import com.comverse.www.ApiExceptionException;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

import java.io.IOException;
import java.util.Map;

@RunWith(ThucydidesRunner.class)
@Story(USSS_6_0_Sanity.B2CPrepaid.ViewingProfile.class)

public class ViewingProfileTest{
        @Managed
        public WebDriver webdriver;

        @ManagedPages(defaultUrl = "http://dev-web01:23001")
        public Pages pages;

        @Steps
        ManageBalanceSteps manageBalanceSteps;

        @Test
        public void display_balance_b2c_prepaid() throws IOException, SSOExceptionException, ApiExceptionException {

            Map<String,String> settings = SettingsTests.getParametersForTest("display_balance_b2c_prepaid");

            String login = settings.get("LoginUser");
            String password = settings.get("PasswordUser");
            String phoneNumber = settings.get("phoneNumber");

            manageBalanceSteps.authorization(login, password);
            manageBalanceSteps.change_balance_and_check_change(phoneNumber);
        }
}
