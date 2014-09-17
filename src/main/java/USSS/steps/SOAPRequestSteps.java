package USSS.steps;

import com.comverse.www.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import sec.rtbd.comverse.org.webservice.auth.*;

import java.rmi.RemoteException;

public class SOAPRequestSteps extends ScenarioSteps {

   private String getToken() throws RemoteException, SSOExceptionException {

        System.setProperty("java.net.preferIPv4Stack" , "true");
        System.setProperty("javax.net.ssl.trustStore", "C:/Program Files/Java/jre8/lib/security/cacerts");
        System.setProperty("javax.net.ssl.trustStorePassword","changeit");

        SAMLSignOnService samlSignOnService = new SAMLSignOnServiceStub();

        ProxyLogin proxyLogin = new ProxyLogin();
        proxyLogin.setString_1("cccuser1");
        proxyLogin.setString_2("password1");
        proxyLogin.setString_3("CCC");

        ProxyLoginE proxyLoginE = new ProxyLoginE();
        proxyLoginE.setProxyLogin(proxyLogin);
        ProxyLoginResponseE proxyLoginResponseE  = samlSignOnService.proxyLogin(proxyLoginE);
        String str = proxyLoginResponseE.getProxyLoginResponse().getResult();

       return str.substring(str.indexOf("<Token>") + "<Token>".length(), str.indexOf("</Token>"));
    }

    @Step
    public void set_balance(String phoneNumber, int value) throws RemoteException, SSOExceptionException, ApiExceptionException {
        String token = getToken();
        CustomerCareService customerCareService = new CustomerCareServiceStub();
        SubscriberUpdateBalanceInstance subscriberUpdateBalanceInstance = new SubscriberUpdateBalanceInstance();
        SubscriberUpdateBalanceInstanceE subscriberUpdateBalanceInstanceE = new SubscriberUpdateBalanceInstanceE();
        SubscriberUpdateBalanceInstanceInputMessage subscriberUpdateBalanceInstanceInputMessage = new SubscriberUpdateBalanceInstanceInputMessage();

        subscriberUpdateBalanceInstanceInputMessage.setSecurityToken(token);
        subscriberUpdateBalanceInstanceInputMessage.setUserIdName("cccuser1");

        SubscriberIdentifier subscriberIdentifier = new  SubscriberIdentifier();

        StringAttributeJAXBElement phNumber = new StringAttributeJAXBElement();
        phNumber.setValue(phoneNumber);
        phNumber.setSet(true);

        ShortAttributeJAXBElement externalId = new ShortAttributeJAXBElement();
        externalId.setSet(true);
        externalId.setValue((short)1);

        subscriberIdentifier.setSubscriberId(phNumber);
        subscriberIdentifier.setSubscriberExternalIdType(externalId);

        subscriberUpdateBalanceInstanceInputMessage.setSubscriberId(subscriberIdentifier);

        NamedBalanceInstanceObject newBalance = new NamedBalanceInstanceObject();

        NumericAttributeJAXBElement totalBalance = new NumericAttributeJAXBElement();
        totalBalance.setSet(true);
        totalBalance.setChanged(true);
        totalBalance.setValue(value);

        newBalance.setTotalBalance(totalBalance);

        StringAttributeJAXBElement balanceName = new StringAttributeJAXBElement();
        balanceName.setValue("CORE BALANCE");
        balanceName.setSet(true);
        balanceName.setChanged(false);

        newBalance.setTotalBalance(totalBalance);
        newBalance.setBalanceName(balanceName);

        NamedBalanceInstanceObject[] balanceInstanceObjects = new NamedBalanceInstanceObject[]{newBalance};

        subscriberUpdateBalanceInstanceInputMessage.setNewBalances(balanceInstanceObjects);
        subscriberUpdateBalanceInstanceInputMessage.setMtrComment("tst_update");
        subscriberUpdateBalanceInstance.setInput(subscriberUpdateBalanceInstanceInputMessage);
        subscriberUpdateBalanceInstanceE.setSubscriberUpdateBalanceInstance(subscriberUpdateBalanceInstance);

        SubscriberUpdateBalanceInstanceResponseE response = customerCareService.subscriberUpdateBalanceInstance(subscriberUpdateBalanceInstanceE);
        System.out.println(response.getSubscriberUpdateBalanceInstanceResponse().getOutput().getOutput().clone()[0].getAvailableBalance().getValue());
    }
}
