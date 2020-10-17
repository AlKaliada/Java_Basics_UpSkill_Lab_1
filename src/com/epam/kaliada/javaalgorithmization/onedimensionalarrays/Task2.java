package com.epam.kaliada.javaalgorithmization.onedimensionalarrays;

import java.util.Arrays;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
// Подсчи­тать количество замен
public class Task2 {
    public static void replaceElementsOfArray (int n, int z){
        int[] a = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i < z){
                a[i] = i + 1;
            } else {
                a[i] = z;
                count++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Number of replaces: " + count);
    }
}
