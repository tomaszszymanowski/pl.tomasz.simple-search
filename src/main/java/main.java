import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws Exception {

        File file = new File("C:\\TzSi\\pl.tomasz\\zakresdat.txt");

        BufferedReader buffRead = new BufferedReader(new FileReader(file));

        String str;

        ArrayList<String> list = new ArrayList<>();

        String searchedName = "Inna";

        while ((str = buffRead.readLine()) != null) {

            if (str.contains(searchedName)) {
                String[] splittedStr = str.split(";");

                for (int i = 2; i < splittedStr.length; i++) {
                    if (splittedStr[i].contains(searchedName)) {
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
