package Bai2;

public class ClassCastExceptionTest {
    public static void main(String[] args) throws ClassCastException {
        Object x = new Integer(15);
        System.out.println((String)x);
    }
}
