import java.util.ArrayList;

public class Layer {

    //private static int numShapes = 0;
    public ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void deleteTriangles() {
        for(int i=0;i<shapes.size();i++)
        {
            if(shapes.get(i) instanceof Triangle) {
                shapes.remove(i);
                Triangle.setNumTri(Triangle.getNumTri() - 1);
                i--;
            }
            //if(Triangle.getNumTri() == 0) break;
        }
    }



}
