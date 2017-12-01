/**
 * Created by CCNE on 15/11/2017.
 */
public class Square extends Expression{

    private Expression expression;

    public Square(Expression e){
        this.expression = e;
    }

    public String toString() {
        throw new UnsupportedOperationException("Not supported yet");
    }

    public int evaluate() {
        return expression.evaluate() * expression.evaluate();
    }

}
