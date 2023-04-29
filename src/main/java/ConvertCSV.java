import com.spire.xls.Workbook;
import com.spire.xls.Worksheet;

import java.io.IOException;

public class ConvertCSV {
    public static void main(String[] args) throws IOException {

        CopyFileService.copySourceFile();

        //Create an instance of Workbook class
        Workbook workbook = new Workbook();
        //Load an Excel file
        workbook.loadFromFile("C:\\TzSi\\AKTUALNE_PROJEKTY\\pl.tomasz.simple-search\\1 Jazdy Spis.xlsx");

        //Get the first worksheet
        Worksheet sheet = workbook.getWorksheets().get(0);

        //Save the worksheet as CSV
//        sheet.saveToFile("C:\\TzSi\\AKTUALNE_PROJEKTY\\pl.tomasz.simple-search\\ExcelToCSV.csv", ",");
        sheet.saveToFile("./pl.tomasz.simple-search/ExcelToCSV.csv", ",");
        Person.personSerach(main.scan());
    }

}
