package Bai1;

public class Square extends Expression {

    private Expression expression;

    public Square(Expression e) {
        expression = e;
    }

    public String toString(){
        throw new UnsupportedOperationException("Not supported yet");
    }

    public int evaluate(){
        return expression.evaluate() * expression.evaluate();
    }

}
