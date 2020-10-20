package com.epam.kaliada.javaalgorithmization.arraysofarrays;
//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class Task2 {
    public static void printDiagonalElementOfMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i]);
        }
    }
}
