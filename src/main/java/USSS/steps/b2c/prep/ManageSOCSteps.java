package USSS.steps.b2c.prep;

import USSS.pages.Exceptions.DisplaySOCsException;
import USSS.pages.b2c.prep.SOCListB2CPrepPage;
import USSS.steps.b2c.GeneralB2CSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ManageSOCSteps extends GeneralB2CSteps {
    public ManageSOCSteps(Pages pages) {
        super(pages);
    }
    @Step
    public void set_filter_all_SOCs(){
        SOCListB2CPrepPage socListB2CPrepPage = getPages().get(SOCListB2CPrepPage.class);
        socListB2CPrepPage.filterSOCs.openAllSOCs();
    }
    @Step
    public void set_filter_connected_SOCs(){
        SOCListB2CPrepPage socListB2CPrepPage = getPages().get(SOCListB2CPrepPage.class);
        socListB2CPrepPage.filterSOCs.openConnectedSOCs();
    }
    @Step
    public void set_filter_available_SOCs(){
        SOCListB2CPrepPage socListB2CPrepPage = getPages().get(SOCListB2CPrepPage.class);
        socListB2CPrepPage.filterSOCs.openAvailableSOCs();
    }
    @Step
    public void select_cats(String... cats){
        SOCListB2CPrepPage socListB2CPrepPage = getPages().get(SOCListB2CPrepPage.class);
        socListB2CPrepPage.catsFilterSOCs.selectCats(cats);
    }
    @Step
    public void unSelect_cats(String... cats){
        SOCListB2CPrepPage socListB2CPrepPage = getPages().get(SOCListB2CPrepPage.class);
        socListB2CPrepPage.catsFilterSOCs.unSelectCats(cats);
    }
    @Step
    public void select_random_cats_and_check_display_SOCs(){
        SOCListB2CPrepPage socListB2CPrepPage = getPages().get(SOCListB2CPrepPage.class);
        List<String> listCats = socListB2CPrepPage.catsFilterSOCs.getListCats();
        Random rand = new Random();
        int countCats = rand.nextInt(listCats.size());
        if (countCats==listCats.size())
            countCats--;
        for (;countCats > 0; countCats--)
            listCats.remove(rand.nextInt(listCats.size() - 1));
        String[] cats = new String[listCats.size()];
        listCats.toArray(cats);
        socListB2CPrepPage.catsFilterSOCs.selectCats(cats);
        List<String> socs = socListB2CPrepPage.getListSOCs();
        for (String soc : socs){
            String catInSoc = socListB2CPrepPage.getCategoriesForSOC(soc);
            if(listCats.indexOf(catInSoc) == -1)
                throw new DisplaySOCsException("Услуга [" + soc + "] с категорией [" + catInSoc + "] не удовлетворяет фильтру! Список категорий фильтра - " + Arrays.toString(listCats.toArray()));
        }
    }
    @Step
    public void enable_random_soc(){
        SOCListB2CPrepPage socListB2CPrepPage = getPages().get(SOCListB2CPrepPage.class);
        List<String> socs = socListB2CPrepPage.getListSOCs();
        Random rand = new Random();
        socListB2CPrepPage.enableNotParameterizedSoc(socs.get(rand.nextInt(socs.size())));
    }

}
