package com.epam.kaliada.javaalgorithmization.arraysofarrays;
//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class Task2 {
    public static void printDiagonalElementOfMatrix(int[][] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a [i][i]);
        }
    }
}
