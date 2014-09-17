package USSS.requirements;

import net.thucydides.core.annotations.Feature;

public class USSS_6_0_Sanity {
    @Feature
    public class B2CPostpaid{
        public class ManageTariffPlans{}
        public class ManageServices{}
        public class ViewingPayments{}
    }
    @Feature
    public class B2CPrepaid{
        public class ManageTariffPlans{}
        public class ManageServices{}
        public class ViewingPayments{}
        public class ViewingProfile{}
    }
    @Feature
    public class B2BPostpaid{
        public class ManageTariffPlans{}
        public class ManageServices{}
    }
    @Feature
    public class B2BPrepaid{
        public class ManageTariffPlans{}
        public class ManageServices{}
    }


}
