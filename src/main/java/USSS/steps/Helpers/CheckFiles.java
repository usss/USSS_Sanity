package USSS.steps.Helpers;

import java.util.List;

/**
 * Created by KPodberezin on 01.10.2014.
 */
public class CheckFiles {

    public boolean CheckExcel(List<String> excel, List<String> sample) {
        if (excel != sample) {
            return false;
        }
        return true;
    }

    public boolean CheckPDF(List<String> pdf, List<String> sample) {
        if (pdf != sample) {
            return false;
        }
        return true;
    }

    public boolean CheckMail(List<String> pdf, List<String> sample) {
        if (pdf != sample) {
            return false;
        }
        return true;
    }

    private boolean CheckFiles(List<String> file, List<String> sample) {
        for (String samp: sample)
        {
            if (!file.contains(samp))
            {
                return false;
            }
        }
        return true;
    }

    private  List<String> file(String path)
    {

    }

}
