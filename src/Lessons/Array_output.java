package Lessons;

public class Array_output {

    public static void main(String[] args) {

        int[] numbers = {1,2,3};    // задавание одномерного массива

        int[][] matrice = { {1,2,3}, {4,5,6}, {7,8,9} };  // задавание двухмерного массива

        for( int i = 0; i < matrice.length; i++ ) {
            for( int j = 0; j < matrice.length; j++ ) {
                System.out.print(matrice[i][j] + " ");
            }

            System.out.println();

        }
    }
}
