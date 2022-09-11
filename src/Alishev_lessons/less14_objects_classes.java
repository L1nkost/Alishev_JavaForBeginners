package Alishev_lessons;

public class less14_objects_classes {
    public static void main(String[] args) {
        Person pers1 = new Person();
        pers1.name = "рома";
        pers1.age = 19;

        System.out.println("меня зовут " +pers1.name + ", " + "мне " + pers1.age + " лет ");

        Person pers2 = new Person();
        pers2.name = "вован";
        pers2.age = 34;

        System.out.println("меня зовут " +pers2.name + ", " + "мне " + pers2.age + " лет ");
    }
}

class Person {
    String name;
    int age;
}