package com.epam.kaliada.javaalgorithmization.arraysofarrays;

import java.util.Arrays;

//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
public class Task13 {
    public static void descendingSortMatrixColumns(int[][] matrix){
        if (!CheckMatrix.isMatrix(matrix)){
            System.out.println("is not a matrix");
            return;
        }
        for (int i = 0; i < matrix[0].length; i++) {
            boolean sorted = false;
            while (!sorted){
                sorted = true;
                for (int j = 0; j < (matrix.length - 1); j++) {
                    if (matrix[j][i] > matrix[j + 1][i]){
                        int a = matrix[j + 1][i];
                        matrix[j + 1][i] = matrix[j][i];
                        matrix[j][i] = a;
                        sorted = false;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void ascendingSortMatrixColumns(int[][] matrix){
        if (!CheckMatrix.isMatrix(matrix)){
            System.out.println("is not a matrix");
            return;
        }
        for (int i = 0; i < matrix[0].length; i++) {
            boolean sorted = false;
            while (!sorted){
                sorted = true;
                for (int j = 0; j < (matrix.length - 1); j++) {
                    if (matrix[j][i] < matrix[j + 1][i]){
                        int a = matrix[j + 1][i];
                        matrix[j + 1][i] = matrix[j][i];
                        matrix[j][i] = a;
                        sorted = false;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
