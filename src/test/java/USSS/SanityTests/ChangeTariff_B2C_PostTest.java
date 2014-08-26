package USSS.SanityTests;

import USSS.requirements.USSS_6_0_Sanity;
import USSS.steps.GeneralSteps;
import USSS.steps.b2c.GeneralB2CSteps;
import USSS.steps.b2c.post.B2C_PostUserSteps;
import USSS.steps.b2c.prep.B2C_PrepUserSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ThucydidesRunner.class)
@Story(USSS_6_0_Sanity.B2C_ManageBPlan.B2C_ChangeBPlanPost.class)
public class ChangeTariff_B2C_PostTest {

    @Steps
    GeneralSteps generalSteps;
    @Steps
    GeneralB2CSteps generalB2CSteps;
    @Steps
    B2C_PostUserSteps B2CSteps;
    @Test
    public void change_tariff(){
        generalB2CSteps.authorization("sel_9030339830_post","FRol370026vf");
        generalB2CSteps.open_tariff_list();
    }
}
