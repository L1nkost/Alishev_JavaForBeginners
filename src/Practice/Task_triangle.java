package Practice;

public class Task_triangle {

    public static void main(String[] args) {

        int a = 3;
        int b = 4;

         int c = (int) Math.sqrt(Math.pow(a ,2) + Math.pow(b ,2));

        System.out.println(c);
        System.out.println();

        int s = 0;
        s = (int) (a + b + c);
        System.out.println(s);

    }
}
