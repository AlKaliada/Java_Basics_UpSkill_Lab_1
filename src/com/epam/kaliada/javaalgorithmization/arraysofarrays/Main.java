package com.epam.kaliada.javaalgorithmization.arraysofarrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Task1
        //int[][] task1 = {{1 ,2, 3, -1, 6}, {2, 6, 1, 3, 0}, {8, 12, 5, 0, 0}, {4, 0, 1, 0, 1}};
        //Task1.printNotEvenColumnsOfMatrix(a);

        //Task2
        //int[][] task2 = {{1 ,2, 3, -1}, {2, 6, 1, 3}, {8, 12, 5, 0}, {4, 0, 1, 0}};
        //Task2.printDiagonalElementOfMatrix(task2);

        //Task3
        //int[][] task3 = {{1 ,2, 3, -1, 6}, {2, 6, 1, 3, 0}, {8, 12, 5, 7, 0}, {4, 0, 1, 0, 1}};
        //Task3.printStringKColumnPInMatrix(task3, 2, 3);

        //Task4
        //System.out.println(Arrays.deepToString(Task4.createMatrix(4)));

        //Task5
        //System.out.println(Arrays.deepToString(Task5.createMatrix(4)));

        //Task6
        //System.out.println(Arrays.deepToString(Task6.createMatrix(6)));

        //Task7
        //System.out.println(Arrays.deepToString(Task7.createMatrixAndCountPositiveElements(3)));

        //Task8
        int[][] task8 = {{1 ,2, 3, -1, 6}, {2, 6, 1, 3, 0}, {8, 12, 5, 0, 0}, {4, 0, 12, 16, 15}};
        System.out.println("Enter the column numbers to be replaced");
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        if (m >= 0 && m < task8.length && n >= 0 && n < task8.length){
            Task8.changeColumnsInMatrix(task8, m, n);
        }else {
            throw new IllegalArgumentException("You entered incorrect dates");
        }
        System.out.println(Arrays.deepToString(task8));

    }
}
