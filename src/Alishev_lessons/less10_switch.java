package Alishev_lessons;

import java.util.Scanner;

public class less10_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = sc.nextInt();
        switch (age) {
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Ты пошёл в школу");
                break;
            case 18:
                System.out.println("Ты окончил школу");
                break;
            default:
                System.out.println("Нет варианта ответа");
        }
    }
}