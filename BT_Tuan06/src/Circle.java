public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(String color, boolean move, double radius, double coordinateX, double coordinateY){
        super(color, move, coordinateX, coordinateY);
        area=area();
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public  String getInfo() {
        return "CIRCLE " +super.getInfo();
    }
}
