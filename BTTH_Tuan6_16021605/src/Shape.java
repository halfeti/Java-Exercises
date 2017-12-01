public class Shape {

    protected double posx,posy,area;
    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPosx() {
        return posx;
    }

    public double getPosy() {
        return posy;
    }

    public void setPosition(double posx, double posy) {
        this.posx = posx;
        this.posy = posy;
    }

    public Shape() {}

    public Shape(double posx, double posy, double area, String color) {
        this.posx = posx;
        this.posy = posy;
        this.area = area;
        this.color = color;
    }
}
