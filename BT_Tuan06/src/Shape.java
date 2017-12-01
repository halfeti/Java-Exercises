abstract public class Shape {
    protected String color;
    protected boolean move;
    protected double area;

    private double coordinateX;
    private double coordinateY;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMove() {
        return move;
    }

    public void setMove(boolean move) {
        this.move = move;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    abstract public double area();

    public void setPosition(double coordinateX, double coordinateY){
        this.coordinateX=coordinateX;
        this.coordinateY=coordinateY;
    }

    public Shape(){}

    public Shape(String color, boolean move, double coordinateX, double coordinateY){
        this.coordinateX=coordinateX;
        this.coordinateY=coordinateY;
        this.move=move;
        this.color=color;
    }

    public String getInfo(){
        return "Color: " + color + ", move: " + move + " ,Position("+ coordinateX + "; "+ coordinateY+ ")";
    }
}
