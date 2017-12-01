package Bai1;

public class Numeral extends Expression{
    private int value;

    public Numeral(int a){
        value = a;
    }

    public void Numeral(){

    }

    public String toString() {
        throw new UnsupportedOperationException("Not supported yet!");
    }

    public int evaluate() {
        return value;
    }

}
