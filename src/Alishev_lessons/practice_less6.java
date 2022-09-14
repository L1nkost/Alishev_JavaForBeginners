package Alishev_lessons;

import java.util.Scanner;
public class practice_less6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 100");

        int point = sc.nextInt();

        if ( point < 42 ) {
            point = point + 16;
            System.out.println(point);
        }
        else if ( point > 42 ) {
            point = point - 10;
            System.out.println(point);
        }
        else if ( point == 42 ) {
            System.out.println("point");
        }
    }
}
