package com.epam.kaliada.javaalgorithmization.arraysofarrays;

import java.util.Arrays;

//Матрицу 10x20 заполнить случайными числами от 0 до 15.
// Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
public class Task11 {
    public static void createMatrix(){
        int[][] matrix = new int[10][20];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            count = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] =  (int) (Math.random() * 15);
                if (matrix[i][j] == 5){
                    count++;
                }
            }
            if (count >= 3){
                System.out.println("In string " + i + " number 5 is three or more times");
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
