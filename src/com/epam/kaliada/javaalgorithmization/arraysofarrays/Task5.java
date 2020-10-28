package com.epam.kaliada.javaalgorithmization.arraysofarrays;


//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task5 {
    public static int[][] createMatrix(int n){
        if (n % 2 != 0){
            throw new IllegalArgumentException("you entered not even n");
        }

        int[][] result = new int[n][n];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < (result.length - i); j++) {
                result[i][j] = i + 1;
            }
        }
        return result;
    }
}
