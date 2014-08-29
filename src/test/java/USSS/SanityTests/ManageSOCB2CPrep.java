package USSS.SanityTests;

import USSS.Utils.SettingsTests;
import USSS.requirements.USSS_6_0_Sanity;
import USSS.steps.b2c.prep.ManageSOCSteps;
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
import java.util.Map;

@RunWith(ThucydidesRunner.class)
@Story(USSS_6_0_Sanity.B2C_ManageSOC.B2C_ManageSOCPrep.class)
public class ManageSOCB2CPrep {

    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://dev-web01:23001")
    public Pages pages;

    @Steps
    ManageSOCSteps B2CSteps;

    @Test
    public void connected_soc() throws IOException {
        Map<String,String> settings = SettingsTests.getParametersForTest("connected_soc");

        String login = settings.get("LoginUser");
        String password = settings.get("PasswordUser");

        B2CSteps.authorization(login,password);
        B2CSteps.open_socs_list();
        B2CSteps.set_filter_available_SOCs();
        B2CSteps.select_random_cats_and_check_display_SOCs();
        B2CSteps.enable_random_soc();
//        B2CSteps.select_cats("Мобильный интернет","Роуминг", "Управление контактами"/*, "Возможности при нуле","Контроль расходов","Управление звонками","Междугородная и международная связь"*/);
//        B2CSteps.unSelect_cats("Мобильный интернет","Роуминг", "Подписки");


    }
}
