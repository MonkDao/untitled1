public class lessonsix {

    public static void main(String[] args) {
        Human h1 = new Human("alex", 10);
        Human h2 = new Human("bob" ,20);
        Human.desc = "nice";
        h1.getAllField();
        h2.getAllField();
        Human.desc = "bad";
        h1.getAllField();
        h2.getAllField();
        System.out.println(Math.PI);
    }


   static class Human{

       private  int age;
       private  String name;


        public static String desc;
        public static int x;

        public Human(){
            System.out.println("hi from first cons");
        }
        public Human(String name){
            System.out.println("hi from second cons");
            this.name = name;
        }
        public Human(String name,int age){
         this.name = name;
         this.age = age;
        }

        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public  void getAllField(){
            System.out.println(name +","+ age +","+ desc);
        }
    }
}
