package Bai01;

public class Apple extends Fruit {
    private boolean poison;

    public boolean isPoison() {
        return poison;
    }

    public void setPoison(boolean poison) {
        this.poison = poison;
    }

    public Apple(){
        price=20000;
        poison=false;
    }
    public Apple(String flavour, int price, boolean poison){
        this.poison=poison;
        this.flavour=flavour;
        this.price=price;
    }

    @Override
    public String toString() {
        return super.toString()+ "Poison: " +isPoison();
    }
}
