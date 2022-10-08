package Alishev_lessons.WildCards;

import Alishev_lessons.WildCards.Animal;

import java.util.List;
import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimals);
        test(listOfDogs);
    }

    private static void test(List<? extends Animal> list) {   // ? = wildcard - передача нескольких объектов. super - все элементы этого класса или выше до класса object
        for(Animal animal : list) {
            animal.eat();
        }
    }
}
