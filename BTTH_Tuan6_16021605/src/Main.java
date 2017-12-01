import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class Main {
    public static void main(String[] args) {

        Diagram d = new Diagram();
        Layer l = new Layer();

        for(int i = 0;i<10;i++)
            l.shapes.add(new Triangle(i,i+3,i*i*sqrt(2),"red"));

        for(int i = 0;i<4;i++)
        {
            d.layers.add(new Layer());
            for(int j=0;j<5;j++)
            {
                d.layers.get(i).shapes.add(new Circle(j+3,j+16,pow(j,2)*Math.PI,"white"));
            }
        }

        System.out.println(Triangle.getNumTri());
        System.out.println(Circle.getNumCir());

        d.deleteCircles();
        l.deleteTriangles();

        System.out.println(Triangle.getNumTri());
        System.out.println(Circle.getNumCir());

    }
}
