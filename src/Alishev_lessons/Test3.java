package Alishev_lessons;

import java.util.List;
import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        /////////// До 5 java //////////////////
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = (String)animals.get(1);
        System.out.println(animal);
        /////////// После дженериков /////////////////
        List<String> animals2 = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal2 = animals2.get(1);
        ///////////// После java 7 ///////////////////
        List<String> animals3 = new ArrayList<>();
    }
}