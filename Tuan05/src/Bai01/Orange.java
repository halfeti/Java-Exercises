package Bai01;

public class Orange extends Fruit {

    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Orange(){}
    public Orange(String flavour, int price, String color){
        this.flavour=flavour;
        this.price=price;
        this.color=color;
    }

    @Override
    public String toString() {
        return super.toString()+", Color: "+ getColor();
    }
}
