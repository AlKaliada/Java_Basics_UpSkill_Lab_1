package com.epam.kaliada.javaalgorithmization.arraysofarrays;
//Найти положительные элементы главной диагонали квадратной матрицы.
public class Task10 {
    public static void findPositiveElementsInMainMatrixDiagonal(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0){
            System.out.println("Element " + i + " " + i + " = " + matrix[i][i]);
            }
        }
    }
}
