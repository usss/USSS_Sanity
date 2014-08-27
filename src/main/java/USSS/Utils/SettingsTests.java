package USSS.Utils;

import org.apache.poi.hssf.record.ExtendedFormatRecord;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SettingsTests {
    public static Map<String,String> getSettingsForTest(String testName) throws IOException {

        InputStream in = new FileInputStream("SettingsTests.xls");
        HSSFWorkbook wb = new HSSFWorkbook(in);
        HSSFSheet sheet = wb.getSheetAt(0);
        Iterator<Row> rows = sheet.rowIterator();
        HSSFRow row = (HSSFRow) rows.next();
        String str  = row.getCell(0).getStringCellValue();
        try {
            while (!str.equals(testName)) {
                row = (HSSFRow) rows.next();
                str = row.getCell(0).getStringCellValue();
            }
        }catch (NullPointerException e){
            throw new NullPointerException("Параметры для теста [" + testName + "] отсутствуют в файле настроек!");
        }
        Map<String,String> map = new HashMap<String, String>();
        map.put(row.getCell(1).getStringCellValue(),row.getCell(2).getStringCellValue());

        row = (HSSFRow) rows.next();
        while(row.getCell(0).getStringCellValue().equals("") || rows.hasNext()) {
            map.put(row.getCell(1).getStringCellValue(),row.getCell(2).getStringCellValue());
            row = (HSSFRow) rows.next();
        }
        return map;
    }
}
