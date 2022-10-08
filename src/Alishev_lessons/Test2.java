package Alishev_lessons;

import Alishev_lessons.WildCards.Animal;
import Alishev_lessons.WildCards.Dog;

public class Test2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog dog = (Dog)a;
        dog.bark();
    }
}
