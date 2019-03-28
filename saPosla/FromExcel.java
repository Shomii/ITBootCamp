
package saPosla;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class FromExcel {

    public static List<String> userName = new ArrayList<String>();
    public static List<String> password = new ArrayList<String>();
    public static File src = new File("C:\\Users\\Korisnik\\Desktop\\FACEBOOK-userPass.xls"); // PODESITI PUTANJU DO FAJLA
    public static HSSFWorkbook wbe;

    public static void main(String[] args) throws IOException {
 
    }

    public void getUserAndPass() throws IOException {

        FileInputStream fis = new FileInputStream(src);
        wbe = new HSSFWorkbook(fis);
        HSSFSheet sheet1 = wbe.getSheetAt(0);

        HSSFRow row1 = sheet1.getRow(0);
        if (row1 != null) {

            int cellNum = row1.getLastCellNum();

            for (int j = 0; j < cellNum; j++) {
                HSSFCell celija1 = row1.getCell(j);
                String data = celija1.getStringCellValue();
                userName.add(data);
            }
        } else {
            System.out.println("<Empty row>");
        }

        HSSFRow row2 = sheet1.getRow(1);
        if (row2 != null) {

            int cellNum = row2.getLastCellNum();
            for (int j = 0; j < cellNum; j++) {
                HSSFCell celija1 = row2.getCell(j);
                String data = celija1.getStringCellValue();
                password.add(data);

            }
        } else {
            System.out.println("<Empty row>");
        }
        wbe.close();
    }

}
