import java.io.File;
import java.io.IOException;
import java.util.Scanner;



class myFile{
    public static void main(String[] args) throws Exception  {
        File file = new File("C:\\Users\\123\\Desktop\\text.txt");
        Scanner s = new Scanner(file);
        while(s.hasNextLine()){
            System.out.println(s.hasNextLine());
        }
        s.close();
    }
}
