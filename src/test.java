import java.io.File;
import java.util.Scanner;
/*
public class test {
    public static void main(String[] args) {
        animals myAni = new animals();
        animals myNewAni = new dog();
       dog dan =  new dog();
        myAni.eat();
        myNewAni.eat();
        dan.bark();
    }
}

 */
class ReadFile {
    public static void main(String[] args) throws Exception {
        File file=new File("C:\\Users\\123\\Desktop\\text.txt");
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}