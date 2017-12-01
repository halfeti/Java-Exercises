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
            }
        }
    }





    public void separateShape() {
        ArrayList<String> namesOfShapes = new ArrayList<String>();
        namesOfShapes.add(layers.get(0).shapes.get(0).getClass().getName());
        for(int i=0;i<layers.size();i++) {
            NEXT:
            for(int j=0;j<layers.get(i).shapes.size();j++) {
                for(int k=0;k<namesOfShapes.size();k++) {
                    if(layers.get(i).shapes.get(j).getClass().getName().equals(namesOfShapes.get(k)))
                        continue NEXT;
                }
                namesOfShapes.add(layers.get(i).shapes.get(j).getClass().getName());
            }
        }


        int initialNumberOfLayers = layers.size();


        for(int i=0;i<namesOfShapes.size();i++) {
            this.layers.add(new Layer());
        }


        for(int i=0;i<layers.size();i++) {
            for(int j=0;j<layers.get(i).shapes.size();j++) {
                for(int k=0;k<namesOfShapes.size();k++) {
                    if(layers.get(i).shapes.get(j).getClass().getName().equals(namesOfShapes.get(k))) {
                        layers.get(initialNumberOfLayers + k).shapes.add(layers.get(i).shapes.get(j));
                    }
                }
            }
        }

        //Xóa các layer ban đầu
        for(int i=0;i<initialNumberOfLayers;i++) {
            layers.remove(0);
            i--;
        }
    }

}
