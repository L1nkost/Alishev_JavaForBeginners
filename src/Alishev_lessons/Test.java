package Alishev_lessons;

public class Test {
    public static void main(String[] args) {
        Animal an = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(an);
        test(dog);
        test(cat);
    }

    public static void test(Animal animal){
        animal.eat();
    }
}
