import com.spire.xls.Workbook;
import com.spire.xls.Worksheet;

import java.io.IOException;

public class ConvertCSV {
    public static void main(String[] args) throws IOException {
        //Create an instance of Workbook class
        Workbook workbook = new Workbook();
        //Load an Excel file
        workbook.loadFromFile("C:\\Users\\Tomasz\\OneDrive\\Ab-As\\auto start\\1 jazdy spis.xlsx");

        //Get the first worksheet
        Worksheet sheet = workbook.getWorksheets().get(0);

        //Save the worksheet as CSV
        sheet.saveToFile("ExcelToCSV.csv", ",");
        Person.personSerach(main.scan());
    }
}
