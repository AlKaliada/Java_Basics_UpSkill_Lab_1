package com.epam.kaliada.javaalgorithmization.onedimensionalarrays;
//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class Task5 {
    public static void printSomeElementsOfArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i){
                System.out.print(array[i] + " ");
            }
        }
    }
}
