package com.epam.kaliada.javaalgorithmization.arraysofarrays;
// Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
// Определить, какой столбец содержит максимальную сумму.
public class Task9 {
    public static void sumOfColumnsInMatrix(int [][] matrix){
        if (!CheckMatrix.isMatrix(matrix)){
            System.out.println("is not a matrix");
            return;
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] < 0){
                        System.out.println("Negative number in matrix");
                        return;
                    }
                }
            }
        }

        int numberColumnWithMaxSum = 0;
        int maxSum = 0;
        int sumColumn;
        for (int i = 0; i < matrix[0].length; i++) {
            sumColumn = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumColumn += matrix[j][i];
            }
            System.out.println("Sum " + i + " column = " + sumColumn);
            if (sumColumn > maxSum){
                maxSum = sumColumn;
                numberColumnWithMaxSum = i;
            }
        }
        System.out.println("Column with max sum is - " + numberColumnWithMaxSum);
    }
}
