package Alishev_lessons;

public class less20_constructors {
    public static void main(String[] args) {
        Human h2 = new Human();
    }
}

class Human {
    private String name;
    private int age;

    public Human() {
        this.name = "Mike";
        this.age = 18;
    }

    public Human(String name) {
        System.out.println("second");
        this.name = name;
    }

    public Human(String name, int age) {
        System.out.println("third");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
