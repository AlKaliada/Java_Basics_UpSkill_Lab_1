package com.epam.kaliada.javaalgorithmization.decomposition;

import java.util.Arrays;

//Составить программу, которая в массиве A[N] находит второе по величине число
// (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
public class Task5 {
    public static void findSecondLargestNumber(int[] array){
        if (array.length == 0){
            System.out.println("You entered zero length array");
            return;
        }
        System.out.println(Arrays.toString(array));
        int a = sortArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(a);


    }
    protected static int sortArray(int[] array){
        Arrays.sort(array);
        return array[array.length - 2];
    }
}
