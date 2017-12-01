package Bai2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionTest {
    public static void main(String[] args) throws IOException {
//        File f = new File("nonExistsFile.txt");
//        FileReader fr = new FileReader(f);
//        System.out.println(fr.read());
//        fr.close();
        throw new IOException();
    }
}
