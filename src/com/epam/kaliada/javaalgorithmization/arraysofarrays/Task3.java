package com.epam.kaliada.javaalgorithmization.arraysofarrays;

import java.util.Arrays;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Task3 {
    public static void printStringKColumnPInMatrix(int[][] matrix, int k, int p){
        if (!CheckMatrix.isMatrix(matrix)){
            System.out.println("is not a matrix");
            return;
        }else if (k > matrix.length || p > matrix[0].length || k <= 0 || p <= 0){
            System.out.println("you entered incorrect data");
            return;
        }

        System.out.print("Column p = " + p + " : ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][p - 1] + " ");
        }
        System.out.println();
        System.out.print("String k = " + k + " : ");
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(matrix[k - 1][i] + " ");
        }

    }
}
