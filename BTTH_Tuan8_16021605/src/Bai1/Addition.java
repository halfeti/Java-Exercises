package Bai1;

public class Addition extends BinaryExpression {
    private Expression left, right;

    public Addition(Expression a, Expression b){
        left = a;
        right = b;
    }

    public Expression left() {
        return left;
    }

    public Expression right() {
        return right;
    }

    public String toString() {
        throw new UnsupportedOperationException("Not supported yet");
    }

    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }

}
