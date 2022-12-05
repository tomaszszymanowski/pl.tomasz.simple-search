import java.io.IOException;
import java.util.Scanner;

public class main{

    public static void main(String[] args) throws IOException {

        Person.personSerach(scan());
    }

    public  static String scan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kogo szukamy?");
        String name = scanner.nextLine();
        return name;
    }
}


