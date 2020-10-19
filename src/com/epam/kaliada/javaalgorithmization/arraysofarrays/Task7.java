package com.epam.kaliada.javaalgorithmization.arraysofarrays;
//Сформировать квадратную матрицу порядка N по правилу:
//A[I, J] = sin((I^2 - J^2) / N)
//и подсчитать количество положительных элементов в ней.
public class Task7 {
    public static double[][] createMatrixAndCountPositiveElements(int n){
        double[][] result = new double[n][n];
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = Math.sin((double)(i * i - j * j) / n);
                if (result[i][j] > 0){
                    count++;
                }
            }
        }
        System.out.println("Count of positive elements: " + count);
        return result;
    }
}
