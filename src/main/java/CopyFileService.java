import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopyFileService {

    static void copySourceFile() throws IOException {
        File src = new File("C:\\Users\\Tomasz\\OneDrive\\Ab-As\\auto start\\1 Jazdy Spis.xlsx");
        File dest = new File("C:\\TzSi\\AKTUALNE_PROJEKTY\\pl.tomasz.simple-search\\1 Jazdy Spis.xlsx");

        // using copy(InputStream,Path Target); method
        Files.copy(src.toPath(), dest.toPath());
    }
}
