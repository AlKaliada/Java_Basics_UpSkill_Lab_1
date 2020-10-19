package com.epam.kaliada.javaalgorithmization.arraysofarrays;

import java.util.Arrays;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task5 {
    public static int[][] createMatrix(int n){
        int[][] result = new int[n][n];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length - i; j++) {
                result[i][j] = i + 1;
            }
        }
        return result;
    }
}
