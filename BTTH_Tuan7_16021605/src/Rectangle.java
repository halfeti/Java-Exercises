public class Rectangle extends Shape {

    private static int numRec = 0;

    public static int getNumRec() {
        return numRec;
    }

    public static void setNumRec(int numRec) {
        Rectangle.numRec = numRec;
    }

    public Rectangle() {
        numRec += 1;
    }

    public Rectangle(double posx, double posy, double area, String color) {
        super(posx, posy, area, color);
        numRec += 1;
    }

}
