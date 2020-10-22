package com.epam.kaliada.javaalgorithmization.arrays;

import java.util.Arrays;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
// Подсчи­тать количество замен
public class Task2 {
    public static void replaceElementsOfArray (double[] n, int z){
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > z){
                n[i] = z;
                count++;
            }
        }
        System.out.println("Number of replaces: " + count);
    }
}
