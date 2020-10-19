package com.epam.kaliada.javaalgorithmization.arraysofarrays;
//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class Task1 {
    public static void printNotEvenColumnsOfMatrix(int[][] a) {
        for (int i = 1; i < a[0].length; i += 2) {
            if (a[0][i] > a[a.length - 1][i]){
                for (int j = 0; j < a.length; j++) {
                    System.out.print(a[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
}
