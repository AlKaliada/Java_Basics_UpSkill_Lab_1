package com.epam.kaliada.javaalgorithmization.sorting;
//Реализуйте сортировку Шелла.
public class Task5 {
    public static void sortShell(int[] array){
        if(array.length == 0){
            System.out.println("You entered an empty array");
        }
        for (int i = (array.length / 2); i > 0; i /= 2) {
            for (int j = i; j < array.length; j ++) {
                int k = j;
                while (k > 0 && array[k] < array[k - i]){
                    int a = array[k];
                    array[k] = array [k - i];
                    array[k - i] = a;
                    k--;
                }
            }
            
        }
    }
}
