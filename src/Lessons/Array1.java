package Lessons;

public class Array1 {

    public static void main(String[] args) {

      int[] numbers = new int[5];           // создание массива
      for( int i = 0; i < numbers.length; i++ ) {
          numbers[i] = i * 10;
      }

      for( int i = 0; i < numbers.length; i++ ) {       // вывод массива
          System.out.println(numbers[i]);

      }
        System.out.println();

      int[] numbers1 = {1,3,6,10,75};       // если мы заранее знаем числа, то задаём их так


        for( int i = 0; i < numbers.length; i++ ) {
          System.out.println(numbers1[i]);
      }
    }
}
