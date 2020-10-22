package com.epam.kaliada.javaalgorithmization.arraysofarrays;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task6 {
    public static int[][] createMatrix(int n){
        int[][] result = new int[n][n];
        for (int i = 0, k = n - 1; i < n / 2; i++, k--) {
            for (int j = i; j < n - i; j++) {
                result[i][j] = 1;
                result[k][j] = 1;
            }
        }
        return result;
    }
}
