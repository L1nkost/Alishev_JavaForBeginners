package Alishev_lessons;

public class less12_for_each {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "привет";
        strings[1] = "пока";
        strings[2] = "java";

        for( int i = 0; i< strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();
        for(String string:strings) {
            System.out.println(string);
        }
        int[] numbers1 = {56,28,379};
        int sum = 0;
        for( int x:numbers1) {
            sum = sum + x;
        }
        System.out.println();
        System.out.println(sum);

        int value = 0;
        String s = "sdlkjsdo";
    }
}