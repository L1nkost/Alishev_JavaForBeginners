package Alishev_lessons;

public class prac_less9_continue {
    public static void main(String[] args) {

        for (int g = 0; g < 37; g++) {

            if (g % 2 != 0) {
                System.out.println(g);
                continue;
            }
        }
    }
}