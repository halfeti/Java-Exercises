package Bai2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("nonExistsFile.txt");
        FileReader fr = new FileReader(f);
    }
}
