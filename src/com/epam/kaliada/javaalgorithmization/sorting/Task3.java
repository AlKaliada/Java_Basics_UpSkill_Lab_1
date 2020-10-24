package com.epam.kaliada.javaalgorithmization.sorting;

import java.util.Arrays;

//Реализуйте сортировку обменами
public class Task3 {
    public static void bubbleSort(int[] array){
        if(array.length == 0){
            System.out.println("You entered an empty array");
        }
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]){
                    int a = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = a;
                    sorted = false;
                }
            }
        }
    }
}
