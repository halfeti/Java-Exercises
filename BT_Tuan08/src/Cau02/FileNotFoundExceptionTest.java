package Cau02;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class FileNotFoundExceptionTest {
    public static void method() throws FileNotFoundException{
        String fileName = "test";
        BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
    }

    public static void main(String[] args) {
        try{
            method();
            System.out.println("No exception!");
        }catch(FileNotFoundException e){
            System.out.println(" Da xay ra ngoai le : "+e);
        }
    }
}
