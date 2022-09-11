package Operators;

public class If {

    public static void main (String[] args) {

        int a = 7;

        if (a >= 8) {
            System.out.println("Человек ");
        } else if (a >= 6) {
            System.out.println("Уже не совсем человек ");

        } else if (a >= 4) {
            System.out.println("Почти не человек ");

        } else if (a >= 2) {
            System.out.println("Не человек ");

        }
    }
}
