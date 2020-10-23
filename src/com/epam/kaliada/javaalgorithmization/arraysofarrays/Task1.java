package com.epam.kaliada.javaalgorithmization.arraysofarrays;

import java.lang.invoke.MethodHandle;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class Task1 {
    public static void printNotEvenColumnsOfMatrix(int[][] matrix) {
        if (!CheckMatrix.isMatrix(matrix)){
            System.out.println("is not a matrix");
            return;
        }

        for (int i = 1; i < matrix[0].length; i += 2) {
            if (matrix[0][i] > matrix[matrix.length - 1][i]){
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
}
