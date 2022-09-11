package Operators;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age");
        int age = scan.nextInt();

        switch(age) {
            case 0:
                System.out.println("You were born ");
                break;
            case 7:
                System.out.println("You went to school ");
                break;
            case 18:
                System.out.println("You went to university");
                break;
            default:
                System.out.println("You bezdar' ");
        }
    }
}
