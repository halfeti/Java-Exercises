abstract public class Shape {
    //shape có thể được tô màu
    protected String color;

    //shape có thể định di chuyển hoặc không
    protected boolean move;

    //Thuộc tính xác định kích thước của shape
    protected double area;

    //Tọa độ x, y của shape xác định vị trí
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

    //phương thức trừu tượng sẽ được định nghĩa cụ thể ở từng kiểu hình vẽ
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
