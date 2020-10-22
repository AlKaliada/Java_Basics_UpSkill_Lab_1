package com.epam.kaliada.javaalgorithmization.arraysofarrays;

import java.util.Arrays;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Task3 {
    public static void printStringKColumnPInMatrix(int[][] matrix, int k, int p){
        if (!CheckMatrix.isMatrix(matrix)){
            System.out.println("is not a matrix");
            return;
        }else if (k >= matrix.length || p >= matrix[0].length){
            System.out.println("you entered incorrect dates");
            return;
        }

        int[] stringK = new int[matrix[0].length];
        int[] columnP = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            columnP[i] = matrix[i][p];
            for (int j = 0; j < matrix[0].length; j++) {
                stringK[j] = matrix[k][j];
            }
        }
        System.out.println("String k = " + k + " - " + Arrays.toString(stringK));
        System.out.println("Column p = " + p + " - " + Arrays.toString(columnP));
    }
}
