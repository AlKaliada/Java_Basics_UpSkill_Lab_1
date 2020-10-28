package com.epam.kaliada.javaalgorithmization.sorting;

import java.util.Arrays;

//Реализуйте сортировку выбором
public class Task2 {
    public static void selectionSort(int[] array){
        if(array.length == 0){
            System.out.println("You entered an empty array");
        }
        int indexOfMin = 0;
        int a;
        for (int i = 0; i < (array.length - 1); i++) {
            indexOfMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexOfMin]){
                    indexOfMin = j;
                }
            }
            a = array[i];
            array[i] = array[indexOfMin];
            array[indexOfMin] = a;
        }
    }
}
