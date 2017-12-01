public class Triangle extends Shape {

    private static int numTri = 0;

    public static int getNumTri() {
        return numTri;
    }

    public static void setNumTri(int numTri) {
        Triangle.numTri = numTri;
    }

    public Triangle() {
        numTri += 1;
    }

    public Triangle(double posx, double posy, double area, String color) {
        super(posx, posy, area, color);
        numTri += 1;
    }

}
