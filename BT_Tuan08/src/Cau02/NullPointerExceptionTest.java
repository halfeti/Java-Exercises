package Cau02;

public class NullPointerExceptionTest {
    public static void test() throws NullPointerException{
        String s = null;
        System.out.println(s.length());
    }
    public static void main(String[] args) {
        try{
            test();
            System.out.println("No Exception!");
        }
        catch (NullPointerException e){
            System.out.println("Da xay ra ngoai le : "+ e);
        }
    }
}
