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
        //1-й способ
        int indexMaxElement = findIndexMaxElement(array);
        int max = array[indexMaxElement];
        if (indexMaxElement == 0){
            array[indexMaxElement] = array[1];
        }else {
            array[indexMaxElement] = array[0];
        }
        System.out.println(array[findIndexMaxElement(array)]);
        array[indexMaxElement] = max;

        //2-й способ
        int[] sortedArray = arraySort(array);
        System.out.println(sortedArray[sortedArray.length - 2]);
    }
    private static int findIndexMaxElement(int[] array){
        int indexMaxElement = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                indexMaxElement = i;
            }
        }
        return indexMaxElement;
    }

    private static int[] arraySort(int[] array){
        return Arrays.copyOf(array, array.length);
    }
}
