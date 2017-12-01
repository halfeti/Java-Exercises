package bigproject;

import java.io.File;
import java.io.IOException;

/*
 *
 * This class is use to get the directory which access to the 'data' folder.
 *
 */

public class Directory {
        
    public static String getDirectory() {
        
        String directory = "";
        try {
            File initial = new File("init.tmp");
            initial.createNewFile();
            //File parent = new File(initial.getParentFile().getName());
            directory = initial.getAbsoluteFile().getParent();
            initial.delete();
            directory += "\\data\\";
            initial = new File(directory + "init.tmp");
            initial.mkdirs();
            initial.createNewFile();
            initial.delete();
        } catch(IOException e) {
            System.out.println("ERROR DIRECTORY");
        }
        
        return directory;
        
    }
    
//    public static void main(String[] args) throws IOException {
//        System.out.println(getDirectory());
//    }
    
}