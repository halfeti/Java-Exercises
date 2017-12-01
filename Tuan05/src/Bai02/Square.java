package Bai02;

public class Square extends Rectangle {
    public Square() {
    }
    public Square(double side){
        length =side;
        width = side;
    }
    public Square(double side, String color, boolean filled){
        length=side;
        width=side;
        this.color=color;
        this.filled=filled;
    }
    public double getSide(){
        return length;
    }
    public void setSide(){
        length=getSide();
    }
    public void setWidth(){
        width= getSide();
    }
    public void setLength(){
        length=getSide();
    }
    @Override
    public String toString() {
        return super.toString() + ", Area: " + getArea()+", Perimeter: " + getPerimeter();
    }
}
