package com.epam.kaliada.strings.arraycharacters;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            //Task1
//        String[] task1= {"camelCase", "numberColumnWithMaxSum", "numberColumnWith", "Name", "name"};
//        Task1.transformationArrayStringToSnakeCase(task1);
//        System.out.println(Arrays.toString(task1));

            //Task2
            String task2 = "word saword wewewor word";
            System.out.println(Task2.replaceWordToLetter(task2));

            //Task3
//            String task3 = "int[]array = {23, 43, 55, 12, 65, 88, 92};";
//            Task3.findCountOfDigits(task3);

            //Task4
            String task4 = "qwqw 12, qw 2 1 5 21.2.51 53.";
            Task4.findCountOfNumbers(task4);

            //Task5
//            String task5 = "   превысил  максимально возможное   для конкретного   массива значение, т.е если мы попытаемся  ";
//            System.out.println(Task5.deleteExtraSpaces(task5));
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

    }
}
