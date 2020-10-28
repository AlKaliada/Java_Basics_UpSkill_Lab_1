package com.epam.kaliada.javaalgorithmization.sorting;

import java.util.Arrays;

// Реализуйте сортировку вставками
public class Task4 {
    public static void insertionSort(int[] array){
        if(array.length == 0){
            System.out.println("You entered an empty array");
        }
        for (int i = 1; i < array.length; i++) {
            int k = i;
            while (k > 0 && (array[k] < array[k - 1])){
                int a = array[k];
                array[k] = array[k - 1];
                array[k - 1] = a;
                k --;
            }
        }
    }
}
