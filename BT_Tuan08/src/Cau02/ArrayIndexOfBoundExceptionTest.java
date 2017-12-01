package Cau02;

public class ArrayIndexOfBoundExceptionTest {
    public static void method() throws ArrayIndexOutOfBoundsException{
        String[] s = new String[2];
        s[2] = "a";
    }

    public static void main(String[] args) {
        try{
            method();
            System.out.println("No exception!");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Xay ra ngoai le : "+e);
        }
    }
}
