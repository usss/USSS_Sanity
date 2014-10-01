package USSS.steps.B2BPleSteps;

import USSS.pages.b2b.post.ple.GeniralPage;
import USSS.pages.b2b.post.ple.ManagerContractPage;
import USSS.steps.AbstractB2CSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

/**
 * Created by KPodberezin on 29.09.2014.
 */
public class ManagerNumberSteps extends AbstractB2CSteps {
    public ManagerNumberSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void open_manager_contract_page() {
        GeniralPage geniralPage = getPages().get(GeniralPage.class);
        geniralPage.onClickManagerContract();
        ManagerContractPage managerContractPage = getPages().get(ManagerContractPage.class);
        managerContractPage.onClickNumberLink();
        managerContractPage.selectTypeImport("онлайн");
        managerContractPage.onClickGetDetails();
        managerContractPage.selectDay();
        managerContractPage.onClickGetDetails();
        managerContractPage.selectMonth();
        managerContractPage.onClickGetDetails();
        managerContractPage.selectTwoWeek();
        managerContractPage.onClickGetDetails();
        managerContractPage.selectWeek();
        managerContractPage.onClickGetDetails();
        managerContractPage.setStartDate(1,"Август","2014");
        managerContractPage.setFinishDate(30,"Август","2014");
        managerContractPage.onClickGetDetails();
    }


}
