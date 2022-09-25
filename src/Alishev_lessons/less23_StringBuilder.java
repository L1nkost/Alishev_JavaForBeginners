package Alishev_lessons;

import java.util.Locale;

public class less23_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb.toString());

        sb.append(" my");
        sb.append(" friend");

        /*
        sb.append(" my").append(" friend"); метод chaining
         */

        System.out.println(sb.toString());
    }
}
