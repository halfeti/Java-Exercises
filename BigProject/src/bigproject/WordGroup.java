package bigproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * This class have methods to interact with word groups
 *
 */

public class WordGroup {
    
    // These following are word group's attributes and contructor.
    // Attributes
    public String name, path;
    public int sotu;
    public static int number_of_word = 0;
    
    
    //Contructor
    public WordGroup(String name) {
        this.name = name;
        path = Directory.getDirectory() + name + ".txt";
    }
    
    /*
     * The following area contain methods to
     * interact with word group.
     * 
     */
    
    //This method find out if the .txt file is already exists or not. It uses name to consider.
    public static boolean isExists(String name) {
        String path = Directory.getDirectory() + name + ".txt";
        File file = new File(path);
        return file.exists();
    }
    
    //This method create a new .txt file with the given name.
    public static void create(String name) throws IOException {
        String path = Directory.getDirectory() + name + ".txt";
        File file = new File(path);
        file.createNewFile();
    }
    
    //This method has not been written done yet. It's use to learning (revision) word.
    public void learn() {
        
    }
    
    
    //This method combine 2 word groups. The given word group will stand at the end of the invoked word group.
    public void merge(WordGroup a) throws IOException {
        File filewrite = new File(this.path);
        File fileread = new File(a.path);
        
        FileWriter fw = new FileWriter(filewrite,true);
        Scanner fr = new Scanner(fileread);
        
        while(fr.hasNextLine()) {
            String line = fr.nextLine();
            fw.write("\r\n");
            fw.write(line);
        }
        
        fw.close();
        fr.close();
        fileread.delete();
        
    }

    //This method rename the selected word group.
    public void renameTo(String name) {
        this.name = name;
        File f = new File(path);
        File temp = new File(f.getParentFile() + "\\" + name + ".txt");
        f.renameTo(temp);
        this.path = Directory.getDirectory() + name + ".txt";
        
    }
    
    
    //This method add a new word to the word group. The new word goes to the end of the .txt file.
    public void addWord() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 tu tieng Anh:");
        String eword = sc.nextLine();
        System.out.println("Nghia cua tu do: ");
        String meanning = sc.nextLine();
        
        try {
            String path = Directory.getDirectory() + name + ".txt";
            File file = new File(path);
            //file.createNewFile();
            FileWriter writer = new FileWriter(file,true);
            writer.write(eword);
            writer.write("\t");
            writer.write(meanning + "\r\n");
            writer.flush();
            writer.close();
        } catch(IOException e) {
            System.out.println("ERROR! " + e);
        }
        
        
        
    }
    
    //This method delete a word in the .txt file by its name.
    public void remove(String name) throws FileNotFoundException, IOException {
        
        File inputFile = new File(path);
        File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");

        Scanner reader = new Scanner(inputFile);
        FileWriter writer = new FileWriter(tempFile,true);

        String currentLine;
        
        while(reader.hasNextLine()) {
            currentLine = reader.nextLine();
            int i = 0;
            String considerWord = "";
            while(i<currentLine.length() && currentLine.charAt(i) != '\t') {
                considerWord += currentLine.charAt(i);
                i++;
            }
            if(!considerWord.equals(name))
                writer.write(currentLine + "\r\n");
        }
        writer.close(); 
        reader.close(); 
        inputFile.delete();
        tempFile.renameTo(inputFile);
        
    }
    
    //This method delete the .txt file of a word group by its name.
    public static void delete(WordGroup a) {
        if(isExists(a.name))
        {
            boolean success = (new File(a.path)).delete();
                if (success) {
                    System.out.println("The file has been successfully deleted"); 
                }
        }
        else    System.out.println("You are trying to delete a non-exists word group.");
    }
    
    //This method show all the containning word inside the .txt file of a word group.
    public void browseWords() throws FileNotFoundException {
        File f = new File(path);
        
        Scanner fr = new Scanner(f);
        
        while(fr.hasNextLine()) {
            String line = fr.nextLine();
            System.out.println(line);
        }
    }
    
}