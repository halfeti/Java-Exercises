public class Square extends Shape {

    private static int numSqu = 0;

    public static int getNumSqu() {
        return numSqu;
    }

    public static void setNumSqu(int numSqu) {
        Square.numSqu = numSqu;
    }

    public Square() {
        numSqu += 1;
    }

    public Square(double posx, double posy, double area, String color) {
        super(posx, posy, area, color);
    }

}
