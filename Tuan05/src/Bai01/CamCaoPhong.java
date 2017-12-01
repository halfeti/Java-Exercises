package Bai01;

public class CamCaoPhong extends Orange {
    private String origin;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public CamCaoPhong(){
        origin= "Cao Phong";
        color= "orange";
    }

    public CamCaoPhong(String flavour, int price, String color, String origin){
        this.flavour=flavour;
        this.price=price;
        this.color=color;
        this.origin=origin;
    }

    @Override
    public String toString() {
        return super.toString()+", Origin: " + getOrigin();
    }
}
