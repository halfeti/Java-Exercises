package Bai01;

public class Fruit {
    protected String flavour;
    protected int price=0;



    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Fruit(){}

    public Fruit(String flavour, int price){
        this.flavour=flavour;
        this.price=price;
    }

    public String toString() {
        return "Flavour: " + getFlavour() + ", Price: "+ getPrice();
    }
}
