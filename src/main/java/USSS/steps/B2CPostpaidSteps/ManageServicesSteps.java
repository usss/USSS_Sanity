package USSS.steps.B2CPostpaidSteps;

import USSS.pages.Exceptions.ConnectionSOCsException;
import USSS.pages.Exceptions.DisplaySOCsException;

import USSS.pages.b2c.post.ServicesPage;
import USSS.pages.b2c.post.RequestHistoryPage;
import USSS.steps.AbstractB2CSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import org.junit.Assert;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class ManageServicesSteps extends AbstractB2CSteps {
    public ManageServicesSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void select_random_cats_and_check_display_services() {
        ServicesPage servicesPage = getPages().get(ServicesPage.class);
        List<String> listCats = servicesPage.getListCats();
        Random rand = new Random();
        int countCats = rand.nextInt(listCats.size());
        if (countCats==listCats.size())
            countCats--;
        for (;countCats > 0; countCats--)
            listCats.remove(rand.nextInt(listCats.size() - 1));
        String[] cats = new String[listCats.size()];
        listCats.toArray(cats);
        servicesPage.selectCats(cats);
        List<String> socs = servicesPage.getListServices();
        for (String soc : socs){
            String catInSoc = servicesPage.getCategoryService(soc);
            if(listCats.indexOf(catInSoc) == -1)
                throw new DisplaySOCsException("Услуга [" + soc + "] с категорией [" + catInSoc + "] не удовлетворяет фильтру! Список категорий фильтра - " + Arrays.toString(listCats.toArray()));
        }
    }
    @Step
    public void set_filter_all_services(){
        ServicesPage servicesPage = getPages().get(ServicesPage.class);
        servicesPage.filterSOCs.openAllSOCs();
    }
    @Step
    public void set_filter_connected_services(){
        ServicesPage servicesPage = getPages().get(ServicesPage.class);
        servicesPage.filterSOCs.openConnectedSOCs();
    }
    @Step
    public void set_filter_available_services(){
        ServicesPage servicesPage = getPages().get(ServicesPage.class);
        servicesPage.filterSOCs.openAvailableSOCs();
    }

    @Step
    public void select_cats(String... cats){
        ServicesPage servicesPage = getPages().get(ServicesPage.class);
        servicesPage.selectCats(cats);
    }
    @Step
    public void unSelect_cats(String... cats){
        ServicesPage servicesPage = getPages().get(ServicesPage.class);
        servicesPage.unSelectCats(cats);
    }

    @Step
    public void enable_service(String service){
        ServicesPage servicesPage = getPages().get(ServicesPage.class);
        servicesPage.enableService(service);
    }
    @Step
    public void disable_service(String service){
        ServicesPage servicesPage = getPages().get(ServicesPage.class);
        servicesPage.disableService(service);
    }

    @Step
    public void check_enable_or_disable_service_in_history_request(String service){
        String expectedStatus = "Обработан";
        RequestHistoryPage requestHistoryPage = getPages().get(RequestHistoryPage.class);
        String actualStatus = requestHistoryPage.getLastRequest().getStatus();
        Assert.assertEquals("Заявка для услуги [" + service + "] отклонена!", expectedStatus, actualStatus);
    }
    @Step
    public void check_absence_service_in_list(String service){
        ServicesPage servicesPage = getPages().get(ServicesPage.class);
        List<String> socs = servicesPage.getListServices();
        for (String socOfList: socs){
            if(service.equals(socOfList)){
                throw new ConnectionSOCsException("Услуга [" + service + "] отключена, но отображается в списке подключенных!");
            }
        }
    }

    @StepGroup
    public void enable_random_service_and_check_enable(String login, String password) throws SQLException, IOException, ClassNotFoundException {
        ServicesPage servicesPage = getPages().get(ServicesPage.class);
        List<String> services = servicesPage.getListServices();
        Random rand = new Random();
        String service = services.get(rand.nextInt(services.size()));
        enable_service(service);
        logout();
        e2e_null_transaction();
        authorization(login, password);
        open_request_history();
        check_enable_or_disable_service_in_history_request(service);
    }
    @StepGroup
    public void disable_random_service_and_check_disable(String login, String password) throws SQLException, IOException, ClassNotFoundException {
        ServicesPage servicesPage = getPages().get(ServicesPage.class);
        List<String> services = servicesPage.getListServicesSwitchTrue();
        Random rand = new Random();

        String service = services.get(rand.nextInt(services.size()));
        disable_service(service);
        logout();
        e2e_null_transaction();
        authorization(login, password);
        open_request_history();
        check_enable_or_disable_service_in_history_request(service);
        open_service_list();
        set_filter_connected_services();
        check_absence_service_in_list(service);
    }
}
