package Bai02;

public class Circle extends Shape {
    private double radius;
    double pi = Math.PI;

    public Circle(){}
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*pi;
    }
    public double getPerimeter(){
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return super.toString() + ", Area: " + getArea()+", Perimeter: " + getPerimeter();
    }
}
