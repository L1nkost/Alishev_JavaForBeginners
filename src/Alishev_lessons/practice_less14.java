package Alishev_lessons;

public class practice_less14 {
    public static void main(String[] args) {

        Person h1 = new Person();
        h1.name = "dude";
        h1.age = 27;

        System.out.println( "Hi " +h1.name+ ", how you live in " +h1.age+ "?" );

        Person h2 = new Person();
        h2.age = 13;
        h2.name = "bob";

        System.out.println( "I'm " +h2.name+ ", just living life. I'm " +h2.age+ " now. It sucks.");

    }
}

class Person {
    String name;
    int age;
}
