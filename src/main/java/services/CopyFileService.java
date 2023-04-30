package services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class CopyFileService {

    public static void copySourceFile() throws IOException {
        File src = new File("C:\\Users\\Tomasz\\OneDrive\\Ab-As\\auto start\\1 Jazdy Spis.xlsx");
        File dest = new File("C:\\TSzi\\simple-search\\1 Jazdy Spis.xlsx");

        // using copy(InputStream,Path Target); method
        Files.copy(src.toPath(), dest.toPath(),REPLACE_EXISTING);
    }
}
