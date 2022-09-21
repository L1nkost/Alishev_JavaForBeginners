package Alishev_lessons;

public class less19 {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setAge(32);
        h1.setName("Joel");
    }
}
class Human {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(name+ " , " +age);
    }
}