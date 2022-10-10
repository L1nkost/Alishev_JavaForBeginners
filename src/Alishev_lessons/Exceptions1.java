package Alishev_lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        File file = new File("test6");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("in method main");
        }
    }
}
