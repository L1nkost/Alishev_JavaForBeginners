package Lessons;

public class Array2 {

    public static void main(String[] args) {

        int[] numbers1 = {1,2,3};       // задавание массива конкретными числами
        int sum = 0;

        for( int x:numbers1) {      // цикл for...each
            sum = sum + x;
        }

        System.out.println(sum);

    }
}
