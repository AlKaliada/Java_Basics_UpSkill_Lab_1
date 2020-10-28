package com.epam.kaliada.javaalgorithmization.arraysofarrays;

import java.util.Arrays;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
public class Task12 {
    public static void descendingSortMatrixStrings(int[][] matrix){
        if (!CheckMatrix.isMatrix(matrix)){
            System.out.println("is not a matrix");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            boolean sorted = false;
            while (!sorted){
                sorted = true;
                for (int j = 0; j < (matrix[0].length - 1); j++) {
                        if (matrix[i][j] > matrix[i][j + 1]){
                            int a = matrix[i][j];
                            matrix[i][j] = matrix[i][j + 1];
                            matrix[i][j + 1] = a;
                            sorted = false;
                        }
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void ascendingSortMatrixStrings(int[][] matrix){
        if (!CheckMatrix.isMatrix(matrix)){
            System.out.println("is not a matrix");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            boolean sorted = false;
            while (!sorted){
                sorted = true;
                for (int j = 0; j < (matrix[0].length - 1); j++) {
                    if (matrix[i][j] < matrix[i][j + 1]){
                        int a = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = a;
                        sorted = false;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
