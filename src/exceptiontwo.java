import java.io.IOException;
import java.util.Scanner;

public class exceptiontwo {
    public static void main(String[] args) throws IOException {
        Scanner myscan = new Scanner(System.in);
        while(true){
       int x =  Integer.parseInt(myscan.nextLine());
       if(x!=0){
           try {
               throw new IOException();
        }catch (IOException e){
               System.out.println("mistacke");
           }
           }
        }
    }
}
