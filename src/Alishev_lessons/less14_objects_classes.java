package Alishev_lessons;

public class less14_objects_classes {
    public static void main(String[] args) {
        Person1 pers1 = new Person1();
        pers1.name = "рома";
        pers1.age = 19;

        System.out.println("меня зовут " +pers1.name + ", " + "мне " + pers1.age + " лет ");

        Person1 pers2 = new Person1();
        pers2.name = "вован";
        pers2.age = 34;

        System.out.println("меня зовут " +pers2.name + ", " + "мне " + pers2.age + " лет ");
    }
}

class Person1 {
    String name;
    int age;
}