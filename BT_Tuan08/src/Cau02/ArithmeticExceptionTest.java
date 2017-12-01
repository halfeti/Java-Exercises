package Cau02;

public class ArithmeticExceptionTest {
    public static void method() throws ArithmeticException{
        int a = 1/0;
    }

    public static void main(String[] args) {
        try{
            method();
            System.out.println("No exception!");
        }catch(ArithmeticException e){
            System.out.println("Da xay ra ngoai le : "+ e);
        }
    }
}
