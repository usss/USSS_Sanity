package USSS.Utils;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SettingsTests {

    private static final String fileSettingsName = "SettingsTests.xls";

    public static Map<String,String> getParametersForTest(String testName) throws IOException {

        InputStream in = null;
        try {
            in = new FileInputStream(fileSettingsName);
            HSSFWorkbook wb = new HSSFWorkbook(in);
            HSSFSheet sheet = wb.getSheetAt(0);



            Iterator<Row> rows = sheet.rowIterator();
            HSSFRow row = (HSSFRow) rows.next();
            String str = row.getCell(0).getStringCellValue();
            try {
                while (!str.equals(testName)) {
                    row = (HSSFRow) rows.next();
                    str = row.getCell(0).getStringCellValue();
                }
            } catch (NullPointerException e) {
                throw new NullPointerException("Параметры для теста [" + testName + "] отсутствуют в файле настроек!");
            }
            Map<String, String> map = new HashMap<String, String>();
            row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
            map.put(row.getCell(1).toString(), row.getCell(2).toString());
            row = (HSSFRow) rows.next();

            while (row.getCell(0).getStringCellValue().equals("")) {
                map.put(row.getCell(1).toString(), row.getCell(2).toString());
                if (rows.hasNext())
                    row = (HSSFRow) rows.next();
                else
                    break;
            }
            return map;
        }
         catch (FileNotFoundException e) {
            throw new FileNotFoundException("Файл настроек не найден!");
        }catch (IOException ex) {
            throw ex;
        }finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static String getURL(){
        return "http://dev-web01:23001";
    }

    public static class EnvironmentEnsemble {
        public static String getDataBase() {
            return "RUS35";
        }
        public static String getHost() {
            return "dynamo";
        }
        public static String getPort() {
            return "1521";
        }
        public static String getUserName() {
            return "vmpapp36";
        }
        public static String getUserPass() {
            return "vmpapp36";
        }
    }
    public static class EnvironmentUSSS{
        public static String getDataBase() {
            return "BSSDEV";
        }
        public static String getHost() {
            return "dev-db01";
        }
        public static String getPort() {
            return "1521";
        }
        public static String getUserName() {
            return "BSSDB4";
        }
        public static String getUserPass() {
            return "BSSDB4";
        }
    }
}
