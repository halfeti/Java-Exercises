package Cau01;

public class Numeral extends Expression {
    private int value;
    public Numeral(){}

    public Numeral(int value) {
        this.value = value;
    }

    public String toString(){
        throw new UnsupportedOperationException("Không được hỗ trợ!");
    }

    public int evaluate() {
        return value;
    }
}
