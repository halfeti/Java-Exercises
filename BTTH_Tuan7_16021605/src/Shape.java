public class Shape {

    protected double posx,posy,area; //Tọa độ và diện tích
    protected String color; //Màu sắc

    //Các phương thức getter, setter tương ứng với các thuộc tính
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

    public void setPosx(double posx) {
        this.posx = posx;
    }

    public void setPosy(double posy) {
        this.posy = posy;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    //Phương thức nhập vị trí của hình
    public void setPosition(double posx, double posy) {
        this.posx = posx;
        this.posy = posy;
    }

    //Các phương thức khởi tạo.
    public Shape() {}

    public Shape(double posx, double posy, double area, String color) {
        this.posx = posx;
        this.posy = posy;
        this.area = area;
        this.color = color;
    }

}
