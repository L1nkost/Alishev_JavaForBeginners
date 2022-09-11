package Lessons;

public class For_each {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "привет";
        strings[1] = "пока";
        strings[2] = "java";

        for( int i = 0; i < strings.length; i++ ) {
            System.out.println(strings[i]);
        }
        System.out.println();
        for(String string:strings) {     // цикл for...each   // первое слово значит тип данных (строка), второе это его название, а третье это на что ссылаемся (откуда берём)
            System.out.println(string);
        }
    }
}
