import java.util.ArrayList;

public class Layer {

    private boolean visible;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    //Mảng chứa tất cả các loại shape trong layer hiện đang xét
    public ArrayList<Shape> shapes = new ArrayList<Shape>();

    //Phương thức xóa tất cả các hình tam giác có trong layer
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

    //Phương thức xóa tất cả các hình trùng nhau trong layer (giữ lại 1 hình, xóa hình trùng còn lại)
    public void deleteSameShape() {
        for(int i=0;i<shapes.size()-1;i++)
        {
            for(int j=i+1;j<shapes.size();j++)
            {
                if(shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                    j--;
                }
            }
        }
    }

}
