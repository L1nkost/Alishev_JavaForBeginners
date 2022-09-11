package Practice;

public class FutToInch {
    public static void main(String[] args) {
        double inches, meters;
        int counter;

        counter = 0;
        for ( inches = 1; inches <= 100; inches++ ) {
            meters = inches * 39.37;
            System.out.println(inches + " метрам соответствует " + meters + " дюймов.");
            counter++;
            if(counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
