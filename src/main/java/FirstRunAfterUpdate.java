import domain.Person;
import services.ConvertXLSCToCSVService;

public class FirstRunAfterUpdate {

    public static void main(String[] args) throws Throwable {
        ConvertXLSCToCSVService.main();
        Person.personSerach(NextLaunches.scan());
    }
    }

