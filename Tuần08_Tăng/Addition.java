/**
 * Created by CCNE on 15/11/2017.
 */
public class Addition extends BinaryExpression {

    private Expression left, right;

    public Addition(Expression left, Expression right){
        this.left = left;
        this.right = right;
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
