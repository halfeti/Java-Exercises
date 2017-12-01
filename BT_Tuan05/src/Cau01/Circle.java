
package Cau01;

public class Circle {
    protected double radius = 1.0;
    private String color = "red";
    public Circle(){

    }
    public Circle(double radius){

    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public String toString(){
        return color;
    }
}
