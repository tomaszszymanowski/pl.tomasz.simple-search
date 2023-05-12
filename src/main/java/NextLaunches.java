import domain.Person;

import java.io.IOException;
import java.util.Scanner;

public class NextLaunches {

    public static void main(String[] args) throws Throwable {


        Person.personSerach(scan());
    }

    public  static String scan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kogo szukamy?");
        return scanner.nextLine();
    }
}

