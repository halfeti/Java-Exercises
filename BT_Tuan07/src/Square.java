public class Square extends Shape {
    private double length;

    public Square(){}

    public Square(String color, boolean move, double length, double coordinateX, double coordinateY){
        super(color, move, coordinateX, coordinateY);
        area=area();
    }

    @Override
    public double area() {
        return length*length;
    }

    @Override
    public String getInfo() {
        return "SQUARE "+ super.getInfo();
    }
}
