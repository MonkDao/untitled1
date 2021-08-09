import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class exceptions {
    public static void main(String[] args) {
   try{
       run();
   } catch (Exception e) {
       System.out.println("cat");
   }
    }
    public static void run() throws Exception {
        System.out.println("");
    }
}


/*
public static void main(String[] args) {
        File myFile = new File("C:\\Users\\123\\Desktop\\text.txt");
        try {
            System.out.println("code inside try");
            Scanner myscan = new Scanner(myFile);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

 */