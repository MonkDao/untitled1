public class lessonthree {
    public static void main(String[] args) {
        Person person1 = new Person();
       person1.setName("Alexando");
       person1.setAge(30);
       person1.speak();
        System.out.println(person1);
    }
}
class Person
{

    private String name;
    private int age;

    public void setName(String username)
    {
        name = username;
        if(username.isEmpty()){
        System. out.println("you umput empty string ");
         } else{
            name = username;
        }
    }
    public String getName()
    {
      return name;
    }
    public void setAge(int userAge)
    {
        age = userAge;
    }
    public int getAge()
    {
        return age;
    }
    void speak()
    {
    for (int i=0; i<2;i++){
        System.out.println("Hi " + name + "my age:" + age);
        }
    }
    public String toString(){
        return name+"," + age;
    }
}

