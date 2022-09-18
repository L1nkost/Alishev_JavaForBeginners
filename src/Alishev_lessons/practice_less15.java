package Alishev_lessons;

public class practice_less15 {
    public static void main(String[] args) {

        Person2 h1 = new Person2();
        h1.name = "dude";
        h1.age = 27;
        h1.sayHello();

        System.out.println( "Hi " +h1.name+ ", how you live in " +h1.age+ "?" );

        Person2 h2 = new Person2();
        h2.age = 13;
        h2.name = "bob";
        h2.speak();

        System.out.println( "I'm " +h2.name+ ", just living life. I'm " +h2.age+ " now. It sucks.");

    }
}

    class Person2 {
        String name;
        int age;

        void speak() {
            System.out.println( "Hi, i'm Jeff Bezos" );
        }
        void sayHello() {
            System.out.println( "Hello" );
        }
    }
