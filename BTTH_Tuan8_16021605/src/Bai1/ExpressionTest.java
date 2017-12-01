package Bai1;

import java.lang.ArithmeticException;

public class ExpressionTest {
    public static void main(String[] args) {

        // Phan 1
//        Bai1.Numeral muoi = new Bai1.Numeral(10);
//        Bai1.Square muoi_mu_2 = new Bai1.Square(muoi);
//        Bai1.Numeral am_mot = new Bai1.Numeral(-1);
//        Bai1.Addition hai_so_dau = new Bai1.Addition(muoi_mu_2, am_mot);
//        Bai1.Numeral sau = new Bai1.Numeral(6);
//        Bai1.Addition trong_ngoac = new Bai1.Addition(hai_so_dau, sau);
//        Bai1.Square ket_qua = new Bai1.Square(trong_ngoac);
//        System.out.println(ket_qua.evaluate());

        // Phan 2
        try {
            Numeral muoi = new Numeral(10);
            Square muoi_mu_2 = new Square(muoi);
            Numeral mot = new Numeral(1);
            Subtraction hai_so_dau = new Subtraction(muoi_mu_2, mot);
            Numeral hai = new Numeral(2);
            Numeral ba = new Numeral(3);
            Multiplication sau = new Multiplication(hai, ba);
            Addition trong_ngoac = new Addition(hai_so_dau, sau);
            Square ket_qua = new Square(trong_ngoac);
            System.out.println(ket_qua.evaluate());
        } catch (ArithmeticException e) {
            System.out.println("Loi chia cho 0");
        }
    }
}
