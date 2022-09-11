package Operators;

import java.util.Scanner;

public class Do_while {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int value;

        do {
            System.out.println("Enter number under 6");
            value = scan.nextInt();
        }
        while (value < 6);

        System.out.println("You entered " + value);
    }
}
