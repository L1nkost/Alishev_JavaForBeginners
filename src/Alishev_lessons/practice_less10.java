package Alishev_lessons;

import java.util.Scanner;

public class practice_less10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int tables = sc.nextInt();

        switch (tables) {
            case 0:
                System.out.println("lack of tables");
                break;
            case 10:
                System.out.println("little more tables");
                break;
            case 20:
                System.out.println("typical amount of tables");
                break;
            case 30:
                System.out.println("huge amount of tables");
                break;
            default:
                System.out.println("none of the variants attached");
        }

    }
}
