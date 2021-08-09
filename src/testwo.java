
public class testwo{
    public static void main(String[] args) {
    AnimClass myanimClasstwo = AnimClass.FROG;
    myanimClasstwo.getTranslate();
    System.out.println( myanimClasstwo.getTranslate());

    AnimClass myanim = AnimClass.FROG;
        System.out.println(myanim.ordinal());

     AnimClass myanimClass = AnimClass.DOG;
     switch (myanimClass) {
         case CAT:
             System.out.println("its cat");
             break;
         case DOG:
             System.out.println("its dog");
             break;
     }
        System.out.println(myanimClass instanceof Object);

    }
}
