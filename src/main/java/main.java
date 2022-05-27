import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class main {
    public static void main(String[] args) throws Exception {

        File file = new File("C:\\TSzi\\simple-search\\test.txt");

        BufferedReader bufRead = new BufferedReader(new FileReader(file));

        String str;

        while((str = bufRead.readLine()) != null){
            System.out.println(str);
        }

    }
}
