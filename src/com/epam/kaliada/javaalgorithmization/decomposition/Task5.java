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
        array[indexMaxElement] = Integer.MIN_VALUE;
        System.out.println(array[findIndexMaxElement(array)]);
        array[indexMaxElement] = max;

        //2-й способ
        int[] arrayCopy = makeArrayCopy(array);
        Arrays.sort(arrayCopy);
        System.out.println(arrayCopy[arrayCopy.length - 2]);
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

    private static int[] makeArrayCopy(int[] array){
        return Arrays.copyOf(array, array.length);
    }
}
