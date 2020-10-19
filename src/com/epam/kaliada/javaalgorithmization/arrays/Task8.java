package com.epam.kaliada.javaalgorithmization.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

//Дана последовательность целых чисел а1 ,а2 ,..., аn. Образовать новую последовательность,
// выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).
public class Task8 {
    public static int[] createNewArray(int[] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min){
                min = a[i];
            }
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == min){
                count++;
            }
        }

        int[] result = new int[a.length - count];
        for (int j = 0, k = 0; j < a.length; j++) {
            if (a[j] == min){
                continue;
            }else {
                result[k] = a[j];
                k++;
            }
        }
        return result;
    }
}
