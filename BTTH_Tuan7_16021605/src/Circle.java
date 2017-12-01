public class Circle extends Shape {

    private static int numCir = 0;

    public static int getNumCir() {
        return numCir;
    }

    public static void setNumCir(int numCir) {
        Circle.numCir = numCir;
    }

    public Circle() {
        numCir += 1;
    }

    public Circle(double posx, double posy, double area, String color) {
        super(posx, posy, area, color);
        numCir += 1;
    }

}
