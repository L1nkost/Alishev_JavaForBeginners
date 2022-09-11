package Practice;

import java.util.Scanner;

public class Weight {

    public static void main(String[] args) {

        Scanner weightCounter = new Scanner(System.in);
        System.out.println("Введите ваш вес: ");
        int num = weightCounter.nextInt();

        double earth = num;
        double moon = earth * 0.17;

        System.out.println("Ваш вес на Луне: " + moon);

    }
}
