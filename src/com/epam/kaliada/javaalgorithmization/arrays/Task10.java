package com.epam.kaliada.javaalgorithmization.arrays;



//Дан целочисленный массив с количеством элементов п.
// Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
public class Task10 {
    public static int[] changeArray(int[] a){
        int[] result = new int[a.length];
        for (int i = 0, k = 0; i < a.length; k++, i += 2) {
            result[k] = a[i];
        }
        return result;
    }
}
