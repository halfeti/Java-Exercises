package Cau01;

public class Cylinder extends Circle {
    private double height = 1.0;
    public Cylinder(){

    }
    public Cylinder(double radius){
        this.radius=radius;
    }
    public Cylinder(double radius, double height){
        this.radius=radius;
        this.height=height;
    }
    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public double getArea() {
        double a=2*super.getArea()+2*height*Math.PI*radius;
        return a;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
