import java.util.ArrayList;
import java.util.List;

public class generici {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("cat");
        list.add("dog");
        Ani myAni = new Ani();
        list.add(myAni);
        String getList = (String)list.get(1);
        System.out.println(getList);
        //------------------------------//
        List<String> listTwo = new ArrayList<>();

        listTwo.add("dog");
        listTwo.add("cat");
        Object myObject = new Object();

    }
}
class Ani{

}
