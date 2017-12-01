import java.util.ArrayList;

public class Layer {
    private boolean visible;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    //Mỗi Layer có thể có 1 hoặc nhiều Shape
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void removeTriangle(){
        for (int i=0; i<shapes.size(); i++){
            if (shapes.get(i) instanceof Triangle){
                shapes.remove(i);
                i--;
            }
        }
    }
    public void deletethesame(){
        for (int i=0; i<shapes.size()-1; i++){
            for ( int j=i+1; j<shapes.size(); j++){
                if(shapes.get(i).equals(shapes.get(j)))
                    shapes.remove(j);
                j--;
            }
        }
    }

}
