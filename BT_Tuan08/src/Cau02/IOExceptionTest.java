package Cau02;

import java.io.IOException;

public class IOExceptionTest {
    public static void method()throws IOException {
        throw new IOException("device error");
    }


    public static void main(String args[]){
        try{
            method();
            System.out.println("No exception!");
        }catch(Exception e){System.out.println("Da xay ra ngoai le: "+ e );}

    }
}
