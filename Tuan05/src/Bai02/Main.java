package Bai02;

public class Main {
    public static void main(String[] args){
        Circle c1 = new Circle(3.2);
        System.out.println("Hinh tron: " +c1.toString());

        Rectangle r1 = new Rectangle(2.5, 15.8, "red", true);
        System.out.println("Hinh chu nhat: " +r1.toString());

        Square s1 = new Square(8.64, "blue", false);
        System.out.println("Hinh vuong: " +s1.toString());
    }
}
