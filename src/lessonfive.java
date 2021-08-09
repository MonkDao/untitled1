public class lessonfive {
    public static void main(String[] args) {
        Human humanone = new Human();
        humanone.setName("Alex");
        humanone.setAge(31);
        humanone.getInfo();

    }
}
    class  Human
    {
        private String name;
        private int age;
        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public String getName(String alex){
            return name;
        }
        public int getAge(){
            return age;
        }
        public void getInfo(){
            System.out.println(name +","+ age);
        }
    }


