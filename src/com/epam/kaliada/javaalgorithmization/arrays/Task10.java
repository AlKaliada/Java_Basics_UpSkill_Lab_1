package com.epam.kaliada.javaalgorithmization.arrays;

import java.util.Arrays;

//Дан целочисленный массив с количеством элементов п.
// Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
public class Task10 {
    public static void changeArray(int[] a){
        for (int i = 0, k = 0; i < a.length; i++, k++) {
            if (k < a.length){
                a [i] = a [k];
                k++;
            }else {
                a[i] = 0;
            }

        }
    }
}
