package USSS.Utils;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SettingsTests {

    private static final String FILE_SETTINGS_NAME = "SettingsTests.xls";

    public static Map<String,String> getParametersForTest(String testName) throws IOException {

        InputStream in = null;
        try {
            in = new FileInputStream(FILE_SETTINGS_NAME);
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
            Map<String, String> map = new HashMap<>();
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
    public static String getURL() throws IOException {
        return getCellText(0,6);
    }

    public static class EnvironmentEnsemble {
        public static String getDataBase() throws IOException {
            return getCellText(3,6);
        }
        public static String getHost() throws IOException {
            return getCellText(4,6);
        }
        public static String getPort() throws IOException {
            return getCellText(5,6);
        }
        public static String getUserName() throws IOException {
            return getCellText(6,6);
        }
        public static String getUserPass() throws IOException {
            return getCellText(7,6);
        }
    }
    public static class EnvironmentUSSS{
        public static String getDataBase() throws IOException {
            return getCellText(3,7);
        }
        public static String getHost() throws IOException {
            return getCellText(4,7);
        }
        public static String getPort() throws IOException {
            return getCellText(5,7);
        }
        public static String getUserName() throws IOException {
            return getCellText(6,7);
        }
        public static String getUserPass() throws IOException {
            return getCellText(7,7);
        }
    }
    private static String getCellText(int row, int column) throws IOException {
        InputStream in = null;
        try{
            in = new FileInputStream(FILE_SETTINGS_NAME);
            HSSFWorkbook wb = new HSSFWorkbook(in);
            HSSFSheet sheet = wb.getSheetAt(0);
            Cell cell  = sheet.getRow(row).getCell(column);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            return cell.getStringCellValue();
        }catch (FileNotFoundException e){
            throw new FileNotFoundException("Файл настроек - [" + FILE_SETTINGS_NAME + "] не найден!");
        } catch (IOException e) {
            throw new IOException("Ошибка чтения ячейки (строка[" + row + "] колонка[" + column + "])");
        }finally {
            if (in!=null){
                try{
                    in.close();
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}
