public class Rectangle extends Shape {
    private double length, height;
    public Rectangle(){
    }

    public Rectangle(String color, boolean move, double length, double height, double coordinateX, double coordinateY){
        super(color, move, coordinateX, coordinateY);
        area=area();
    }

    @Override
    public double area() {
        return length*height;
    }

    @Override
    public String getInfo() {
        return "RECTANGLE " + super.getInfo();
    }
}
