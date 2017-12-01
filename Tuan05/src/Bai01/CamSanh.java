package Bai01;

public class CamSanh extends Orange {
    private double size=0.0;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public CamSanh(String flavour, int price, String color, double size){
        this.flavour=flavour;
        this.price=price;
        this.color=color;
        this.size=size;
    }

    @Override
    public String toString() {
        return super.toString() + ", Size: "+ getSize();
    }
}
