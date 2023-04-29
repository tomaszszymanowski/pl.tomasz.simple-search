import java.io.*;
import java.util.ArrayList;

public class Person {

    public static void personSerach(String name) throws IOException {
        File file = new File("C:\\TzSi\\AKTUALNE_PROJEKTY\\pl.tomasz.simple-search\\ExcelToCSV.csv");

        BufferedReader buffRead = new BufferedReader(new FileReader(file));
        String str;
        ArrayList<String> list = new ArrayList<>();

        while ((str = buffRead.readLine()) != null) {

            if (str.contains(name)) {
                String[] splittedStr = str.split(",");

                for (int i = 2; i < splittedStr.length; i++) {
                    if (splittedStr[i].contains(name)) {
                        String dateAndTime = splittedStr[0] + " " + splittedStr[i - 2] + " " + splittedStr[i];
                        list.add(dateAndTime);
                    }
                }
            }
        }

        for (String meetings:list){
            System.out.println(meetings);
        }
    }
}
