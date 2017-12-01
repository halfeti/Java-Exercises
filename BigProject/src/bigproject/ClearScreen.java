package bigproject;

/*
 * 
 * This class is use to clear the console screen.
 * Not use in GUI.
 *
 */
public class ClearScreen {
    public static void cls() {
        for(int i = 0;i<100;i++)
            System.out.println();
    }
}
