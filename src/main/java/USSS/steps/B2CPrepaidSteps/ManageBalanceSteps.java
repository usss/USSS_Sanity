package USSS.steps.B2CPrepaidSteps;

import USSS.pages.b2c.prep.ProfilePage;
import USSS.steps.AbstractB2CSteps;
import USSS.steps.SOAPRequestSteps;
import com.comverse.www.ApiExceptionException;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Assert;
import sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

import java.rmi.RemoteException;

public class ManageBalanceSteps extends AbstractB2CSteps {

    @Steps
    SOAPRequestSteps soapRequestSteps;

    public ManageBalanceSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void change_balance_and_check_change(String phNumber) throws ApiExceptionException, RemoteException, SSOExceptionException {
        ProfilePage profileB2CPage = getPages().get(ProfilePage.class);
        String balance = profileB2CPage.getBalance();
        int currentBalance = Integer.parseInt(balance.substring(0, balance.length() - 5));
        int expectedBalance =  currentBalance + 228;
        soapRequestSteps.set_balance(phNumber,expectedBalance);
        profileB2CPage.balance.updateBalance();
        int actualBalance = Integer.parseInt(profileB2CPage.getBalance());
        Assert.assertEquals(expectedBalance, actualBalance);
    }
}
