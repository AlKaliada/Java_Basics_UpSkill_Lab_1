package com.epam.kaliada.javaalgorithmization.arraysofarrays;

import java.util.Arrays;

// Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.
public class Task14 {
    public static void createRandomMatrix(int m, int n){
        int[][] matrix = new int[m][n];
        for (int i = 1; i < n; i++) {
            int a = 0;
            while (a < i && a != m){
                int b = (int) (Math.random() * m);
                if (matrix[b][i] != 1){
                    matrix[b][i] = 1;
                    a++;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
