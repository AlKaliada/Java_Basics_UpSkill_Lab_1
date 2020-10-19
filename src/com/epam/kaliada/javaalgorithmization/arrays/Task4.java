package com.epam.kaliada.javaalgorithmization.arrays;

import java.util.Arrays;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
public class Task4 {
    public static void changeMinAndMaxElements(int[] array){
        int max = array[0];
        int min = array[0];
        int minElements = 0;
        int maxElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
                minElements = i;
            }
            if (array[i] > max){
                max = array[i];
                maxElements = i;
            }
        }
        int a = array[maxElements];
        array[maxElements] = array[minElements];
        array[minElements] = a;
        System.out.println(Arrays.toString(array));
    }
}
