import java.util.ArrayList;

public class Diagram {

    public ArrayList<Layer> layers = new ArrayList<Layer>();

    public void deleteCircles() {

        for(int i = 0;i<layers.size();i++)
        {
            for(int j = 0 ; j < layers.get(i).shapes.size();j++)
            {
                if(layers.get(i).shapes.get(j) instanceof Circle)
                {
                    layers.get(i).shapes.remove(j);
                    Circle.setNumCir(Circle.getNumCir() - 1);
                    j--;
                }
                //if(Circle.getNumCir() == 0) break;
            }
        }
    }

}
