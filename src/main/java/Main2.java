import java.io.*;
import java.util.*;

public class Main2 {

    public static void main(String[] args) throws FileNotFoundException {

        List<StringBuilder> allDays = new ArrayList<StringBuilder>(100); // ograniczenie
        File file = new File("C:\\TSzi\\simple-search\\zakresdat.txt");
        Scanner scanner = new Scanner(file);
        StringBuilder day = new StringBuilder();

        while (scanner.hasNextLine()) {
            String lineOfText = scanner.nextLine();
            if (lineOfText.substring(0,8).matches("\\d{2}-\\d{2}-\\d{2}")) {
                System.out.println(day);
                allDays.add(day);
                System.out.println(allDays.size());
                day.delete(0, day.length());
            }
            day.append(lineOfText);
        }

        for (StringBuilder allDay : allDays) {
            String contentToCheck = allDay.toString();
            if (contentToCheck.contains("Natalia")) {
                System.out.println(contentToCheck);
            }
        }

        System.out.println(allDays.get(0));
        System.out.println(allDays.get(1));
        System.out.println(allDays.get(2));
        System.out.println(allDays.get(1100));
        System.out.println(allDays.get(1114));
    }
}