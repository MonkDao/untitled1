/*
class testwo {
    public static void main(String[] args) {
        elecCar myElecCar = new elecCar();
        myElecCar.start();
    }
}
*/
public class elecCar {
    private int id;
    private class Motor{
    public void starMotor(){
      System.out.println("Start" + id + "motors");
   }
 }

 public static class Battery{
        public void charge(){
            System.out.println("battery ...");
        }
 }


public void start(){
       Motor myMotor = new Motor();
       myMotor.starMotor();

       final int x = 1;

       class SomeClass{
           public void someMethod(){
               System.out.println(x);
           }
       }
       System.out.println("start"+ id);
   }
}
