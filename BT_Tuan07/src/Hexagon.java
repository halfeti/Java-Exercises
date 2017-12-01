public class Hexagon extends Shape{
    private double side;
    public Hexagon() {
    }
    public Hexagon(String color, boolean move, double coordinateX, double coordinateY){
        super(color, move, coordinateX, coordinateY);
        area=area();
    }

    @Override
    public double area() {
        return side*side*3*Math.sqrt(3)/2;
    }

    @Override
    public String getInfo() {
        return "HEXAGON: "+ super.getInfo();
    }
}

