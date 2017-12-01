package Bai01;

public class Main {
    public static void main(String[] args){
        Apple tao1 = new Apple();
        Apple tao2 = new Apple("natural", 25000, false);
        Orange caophong1 = new CamCaoPhong();
        CamCaoPhong caophong2 = new CamCaoPhong("no flavour", 15000, "orange", "Trung Quoc");
        CamSanh camsanh = new CamSanh("natural", 20000, "green", 6);

        System.out.println("Tao1: " +tao1.toString());
        System.out.println("Tao2: " + tao2.toString());
        System.out.println("Cam Cao Phong 1: " + caophong1.toString());
        System.out.println("Cao Cao Phong 2: " +caophong2.toString());
        System.out.println("Cam sanh: " + camsanh.toString());
    }
}
