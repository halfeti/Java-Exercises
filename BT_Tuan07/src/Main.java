
public class Main {
    public static void main(String[] args) {
        Diagram diagram= new Diagram();
        Layer layer = new Layer();


        Rectangle rectangle1 = new Rectangle("red", true, 7, 3.6, 0.0, 1.5);
        Square square1 = new Square("blue", true, 13.62, 0, 2);
        Triangle triangle1 = new Triangle("black", false, 10.3, 2, -2.6, 3.4);
        Circle circle1 = new Circle("white", false, 36, 4.5, -1);

        layer.shapes.add(rectangle1);
        layer.shapes.add(square1);
        layer.shapes.add(triangle1);
        layer.shapes.add(circle1);

        diagram.layers.add(layer);

        for(Shape s: layer.shapes){
            System.out.println(s.getInfo());
        }
        diagram.removeCircle();
        layer.removeTriangle();

        System.out.println("Deleting...");

        for(Shape s: layer.shapes){
            System.out.println(s.getInfo());
        }
    }

}
