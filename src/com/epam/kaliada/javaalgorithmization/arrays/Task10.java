package com.epam.kaliada.javaalgorithmization.arrays;

import java.util.Arrays;

//Дан целочисленный массив с количеством элементов п.
// Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
public class Task10 {
    public static void changeArray(int[] a){
        for (int i = 1; i < a.length; i++) {
            a[i] = 0;
            i++;
        }
    }
}
