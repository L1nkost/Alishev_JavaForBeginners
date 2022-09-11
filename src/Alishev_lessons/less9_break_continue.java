package Alishev_lessons;

public class less9_break_continue {
    public static void main(String[] args) {
        for ( int i = 3; i <= 10; i++ ) {
            if ( i%2==0 ) {
                continue;
            }
            System.out.println("Нечётное число "+i);
        }
    }
}
