package Lessons;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Array3 {
    public static void main(String[] args) {
        int[] number = {1,2,3};     // одномерный массив
        System.out.println(number[1]);
        System.out.println();

        int[][] matrix = { {1,2,3,4,5} , {4,5} , {7,8,9} };      // двухмерный массив (матрица)
        System.out.println(matrix[2][2]);
        System.out.println(matrix[1][0]);
        System.out.println(matrix[0][4]);
        System.out.println();

        String[][] strings = new String[2][3];      // строковый двухмерный массив
        strings[0][1] = "привет";
        System.out.println(strings[0][1]);
    }
}
