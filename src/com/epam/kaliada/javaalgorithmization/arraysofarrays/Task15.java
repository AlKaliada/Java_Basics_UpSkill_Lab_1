package com.epam.kaliada.javaalgorithmization.arraysofarrays;
//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
public class Task15 {
    public static void findMaxMatrixElementAndChangeMatrix(int[][] matrix){
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max = matrix[i][j] > max ? matrix[i][j] : max;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = matrix[i][j] % 2 != 0 ? max : matrix[i][j];
            }
        }
    }
}
