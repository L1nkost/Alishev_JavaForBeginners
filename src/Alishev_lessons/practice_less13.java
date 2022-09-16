package Alishev_lessons;

public class practice_less13 {
    public static void main(String[] args) {

        int[][] matr = {{3,45,6},{7,39,3},{9,3,7}};

        for ( int i = 0; i < matr.length; i++ ) {
            for ( int d = 0; d < matr[i].length; d++ ) {
                System.out.print(matr[i][d] + " ");
            }
            System.out.println( );
        }
    }
}
