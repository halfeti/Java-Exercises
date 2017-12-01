package Cau01;

public class Square extends Expression {
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    public String toString(){
        throw new UnsupportedOperationException("Không được hỗ trợ!");
    }

    public int evaluate() {
        return expression.evaluate()*expression.evaluate();
    }
}
