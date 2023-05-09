import com.spire.xls.Workbook;
import com.spire.xls.Worksheet;
import domain.Person;
import services.CopyFileService;



public class FirstRunAfterUpdate {
    public static void main(String[] args) throws Throwable {

        CopyFileService.copySourceFile();

        //Create an instance of Workbook class
        Workbook workbook = new Workbook();
        //Load an Excel file
        workbook.loadFromFile("C:\\TSzi\\simple-search\\1 Jazdy Spis.xlsx");

        //Get the first worksheet
        Worksheet sheet = workbook.getWorksheets().get(0);

        //Save the worksheet as CSV
//        sheet.saveToFile("C:\\TzSi\\AKTUALNE_PROJEKTY\\pl.tomasz.simple-search\\ExcelToCSV.csv", ",");
        sheet.saveToFile("C:\\TSzi\\simple-search\\ExcelToCSV.csv", ",");
        Person.personSerach(NextLaunches.scan());
    }

}
