import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class anonim {
    public void eat(){
        System.out.println("i am eating");
    }
}
class Animal{
    public static void main(String[] args) {
        anonim myAnimal = new anonim();
        myAnimal.eat();

    }
    anonim myAnon = new anonim(){
        public void eat(){
            System.out.println("i like bones");
        }
    };

}
interface elbeToEat{
    public void eat();
}
class Test{
    public static void main(String[] args) {
    elbeToEat myeat = new elbeToEat() {
        @Override
        public void eat() {
            System.out.println("eating");
        }
    };
    }
}

