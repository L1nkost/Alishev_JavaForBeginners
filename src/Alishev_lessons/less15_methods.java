package Alishev_lessons;

public class less15_methods {
    public static void main(String[] args) {
        Persona pers1 = new Persona();
        pers1.name = "рома";
        pers1.age = 19;
        pers1.sayHello();

        Persona pers2 = new Persona();
        pers2.name = "вован";
        pers2.age = 35;
        pers2.speak();

    }
}

class Persona {
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет"); }
        }
        void sayHello() {
            System.out.println("Привет");
    }
}