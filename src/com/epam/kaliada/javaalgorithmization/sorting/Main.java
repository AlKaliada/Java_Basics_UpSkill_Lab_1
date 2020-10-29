package com.epam.kaliada.javaalgorithmization.sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            //Task1
            int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int[] b = {10, 11};
            int k = 0;
//            System.out.println(Arrays.toString(Task1.combiningArraysFirst(a,b,k)));
            System.out.println(Arrays.toString(Task1.combiningArraysSecond(a,b,k)));

            //Task2
//            int[] task2 = new int[-1];
//            Task2.selectionSort(task2);
//            System.out.println(Arrays.toString(task2));

            //Task3
//            int[] task3 = {4, 3, 1, 8, 0, 12, 43};
//            Task3.bubbleSort(task3);
//            System.out.println(task3);

            //Task4
//            int[] task4 = {4, 3, 1, 8, 0, 12, -2};
//            Task4.insertionSort(task4);
//            System.out.println(Arrays.toString(task4));

            //Task5
//            int[] task5 = {4, 3, 1, 8, 0, 12, -2};
//            Task5.sortShell(task5);
//            System.out.println(Arrays.toString(task5));


        }catch (IllegalArgumentException | NegativeArraySizeException e){
            e.printStackTrace();
        }

    }
}
