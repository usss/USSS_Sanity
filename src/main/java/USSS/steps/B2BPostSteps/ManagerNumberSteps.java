package USSS.steps.B2BPostSteps;

import USSS.pages.b2b.post.post.GeniralPage;
import USSS.pages.b2b.post.post.ManagerContractPage;
import USSS.steps.AbstractB2CSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;


/**
 * Created by KPodberezin on 26.09.2014.
 */
public class ManagerNumberSteps extends AbstractB2CSteps {
    public ManagerNumberSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void open_manager_contract_page(){
        GeniralPage geniralPage = getPages().get(GeniralPage.class);
        geniralPage.onClickManagerContract();
        ManagerContractPage managerContractPage = getPages().get(ManagerContractPage.class);
        managerContractPage.onClickNumberLink();
        managerContractPage.onClickCurrentPeriod();
        managerContractPage.onClickCheck();
        managerContractPage.onClickCurrentPeriod();
        managerContractPage.onClickGetDetails();
        managerContractPage.onClickImportDetails();
    }
}
