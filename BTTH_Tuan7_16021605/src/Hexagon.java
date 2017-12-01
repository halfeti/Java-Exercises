public class Hexagon extends Shape {

    private static int numHex = 0;

    public static int getNumHex() {
        return numHex;
    }

    public static void setNumHex(int numHex) {
        Hexagon.numHex = numHex;
    }

    public Hexagon() {
        numHex += 1;
    }

    public Hexagon(double posx, double posy, double area, String color) {
        super(posx, posy, area, color);
        numHex += 1;
    }

}
