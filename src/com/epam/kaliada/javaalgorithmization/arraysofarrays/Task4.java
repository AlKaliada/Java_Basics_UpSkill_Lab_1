package com.epam.kaliada.javaalgorithmization.arraysofarrays;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task4 {
    public static int[][] createMatrix(int n){
        int[][] result = new int[n][n];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = i % 2 == 0 ? j + 1 : result.length - j;
            }
        }
        return result;
    }
}
