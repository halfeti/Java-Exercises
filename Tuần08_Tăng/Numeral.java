/**
 * Created by CCNE on 15/11/2017.
 */
public class Numeral extends Expression {
    private int value;
    public Numeral(int v){
        this.value = v;
    }
    public Numeral(){
    }

    public String toString() {
        throw new UnsupportedOperationException("Not supported yet");
    }

    public int evaluate() {
        return value;
    }

}
