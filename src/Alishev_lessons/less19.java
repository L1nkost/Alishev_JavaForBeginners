package Alishev_lessons;

public class less19 {
    public static void main(String[] args) {
        Human1 h1 = new Human1();
        h1.setAge(32);
        h1.setName("Joel");
        h1.getInfo();
    }
}
class Human1 {
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