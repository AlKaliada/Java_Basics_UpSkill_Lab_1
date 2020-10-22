package com.epam.kaliada.javaalgorithmization.arrays;

import java.util.Arrays;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
public class Task4 {
    public static void changeMinAndMaxElements(double[] array){
        if (array.length <= 0){
            System.out.println("Wrong length of array");
            return;
        }
        double max = array[0];
        double min = array[0];
        int indexMinElement = 0;
        int indexMaxElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
                indexMinElement = i;
            }
            if (array[i] > max){
                max = array[i];
                indexMaxElement = i;
            }
        }
        array[indexMinElement] = max;
        array[indexMaxElement] = min;
        System.out.println(Arrays.toString(array));
    }
}
