public class Triangle extends Shape {
    private double length, height;

    public Triangle() {
    }

    public Triangle (String color, boolean move, double length, double height, double coordinateX, double coordinateY){
        super(color, move, coordinateX, coordinateY);
        area=area();
    }
    @Override
    public double area() {
        return length*height/2;
    }

    @Override
    public String getInfo() {
        return "TRIANGLE "+ super.getInfo();
    }
}
