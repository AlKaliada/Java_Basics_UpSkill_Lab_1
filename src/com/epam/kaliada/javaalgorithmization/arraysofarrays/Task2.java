package com.epam.kaliada.javaalgorithmization.arraysofarrays;
//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class Task2 {
    public static void printDiagonalElementOfMatrix(int[][] matrix){
        if (!CheckMatrix.isMatrixSquare(matrix)){
            System.out.println("is not a square matrix");
            return;
        }

        for (int i = 0; i < matrix.length; i++) { //печать диагонали с левого верхнего угла в правый нижний
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) { //печать диагонали с правого верхнего угла в левый нижний
            System.out.print(matrix[i][matrix.length - i - 1] + " ");
        }

    }
}
