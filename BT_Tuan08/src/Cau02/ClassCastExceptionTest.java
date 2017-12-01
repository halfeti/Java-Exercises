package Cau02;

public class ClassCastExceptionTest {
    public static void method() throws ClassCastException{
        Object obj = Integer.valueOf(42);
        String s = (String)obj;
    }

    public static void main(String[] args) {
        try{
            method();
            System.out.println("No exception!");
        }catch(ClassCastException e){
            System.out.println("Da xay ra ngoai le : "+e);
        }
    }
}
