package Cau01;

import java.lang.ArithmeticException;

public class TestExpression {
    public static void main(String[] args) {
//        Cau01.Numeral ten = new Cau01.Numeral(10);
//        Cau01.Square tenSquare = new Cau01.Square(ten);
//        Cau01.Numeral negativeOne = new Cau01.Numeral(-1);
//        Cau01.Addition tenSquareSubrtactOne = new Cau01.Addition(tenSquare, negativeOne);
//        Cau01.Numeral six = new Cau01.Numeral(6);
//        Cau01.Addition tenSquareSubrtactOneAddsix = new Cau01.Addition(tenSquareSubrtactOne, six);
//        Cau01.Square answer = new Cau01.Square(tenSquareSubrtactOneAddSix);
//        System.out.println("Ket qua: " + answer.evaluate());

        try{
            Numeral ten = new Numeral(10);
            Square tenSquare = new Square(ten);
            Numeral one = new Numeral(1);
            Subtraction tenSquareSubrtactOne = new Subtraction(tenSquare, one);
            Numeral two = new Numeral(2);
            Numeral three = new Numeral(3);
            Multiplication twoMulThree = new Multiplication(two, three);
            Addition tenSquareSubrtactOneAddSix = new Addition(tenSquareSubrtactOne, twoMulThree);
            Square answer = new Square(tenSquareSubrtactOneAddSix);
            System.out.println("Kết quả: " + answer.evaluate());
        }
        catch (ArithmeticException aE){
            System.out.println("Lỗi chia cho 0");
        }

    }
}
