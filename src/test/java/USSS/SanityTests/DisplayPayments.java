package USSS.SanityTests;


import USSS.Utils.SettingsTests;
import USSS.requirements.USSS_6_0_Sanity;
import USSS.steps.RootUserSteps;
import USSS.steps.SOAPRequestSteps;
import USSS.steps.b2c.GeneralB2CSteps;
import USSS.steps.b2c.post.FinanceAndDetailsB2CPost;

import USSS.steps.b2c.prep.FinanceAndDetailsB2CPrep;
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
import sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService;
import sec.rtbd.comverse.org.webservice.auth.SAMLSignOnServiceStub;
import sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.xml.ws.BindingProvider;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.util.Map;

@RunWith(ThucydidesRunner.class)
@Story(USSS_6_0_Sanity.DisplayPayments.class)
public class DisplayPayments {
    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://dev-web01:23001")
    public Pages pages;

    @Steps
    FinanceAndDetailsB2CPrep financeAndDetailsStepsPrep;

    @Steps
    FinanceAndDetailsB2CPost financeAndDetailsStepsPost;

    @Steps
    SOAPRequestSteps soapRequestSteps;

    @Test
    public void check_display_payments_b2c_prep() throws IOException, ParseException {

        Map<String,String> settings = SettingsTests.getParametersForTest("check_display_payments_b2c_prep");

        String login = settings.get("LoginUser");
        String password = settings.get("PasswordUser");
        String startDate =  settings.get("StartDate");
        String endDate =  settings.get("EndDate");

        financeAndDetailsStepsPrep.authorization(login, password);
        financeAndDetailsStepsPrep.open_finance_and_details_page_and_check_page();
        financeAndDetailsStepsPrep.check_filter_date(startDate, endDate);
        financeAndDetailsStepsPrep.check_display_options_of_filter_by_type_payments();
        financeAndDetailsStepsPrep.check_filter_type_payments();
        financeAndDetailsStepsPrep.delete_filter_by_payment_type();
        //todo : доделать выгрузку в excel
    }
    @Test
    public void check_display_payments_b2c_post() throws IOException, ParseException {

        Map<String,String> settings = SettingsTests.getParametersForTest("check_display_payments_b2c_post");

        String login = settings.get("LoginUser");
        String password = settings.get("PasswordUser");
        String startDate =  settings.get("StartDate");
        String endDate =  settings.get("EndDate");

        financeAndDetailsStepsPost.authorization(login, password);
        financeAndDetailsStepsPost.open_finance_and_details_page_and_check_page();
        financeAndDetailsStepsPost.check_filter_date(startDate, endDate);
        financeAndDetailsStepsPost.check_display_options_of_filter_by_type_payments();
        financeAndDetailsStepsPost.check_filter_type_payments();
        //todo : доделать выгрузку в excel
    }
    @Test
    public void soap_request() throws RemoteException, SSOExceptionException, ApiExceptionException {
        soapRequestSteps.setBalance();
    }
}
