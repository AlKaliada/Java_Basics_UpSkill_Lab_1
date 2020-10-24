package com.epam.kaliada.javaalgorithmization.sorting;
//Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя дополнительный массив.
public class Task1 {
    public static int[] combiningArraysFirst(int[] a, int[] b, int k){
        if (a.length == 0 || b.length == 0){
            throw new IllegalArgumentException("You entered an empty array");
        }
        int q = 0;
        for (int i = a.length - 1; i > k; i--) {
            if (i > b.length + k){
                a[i] = a[i - b.length];
            }else {
                a[k + 1 + q] = b[q];
                q++;
            }
        }
        return a;
    }

    public static int[] combiningArraysSecond(int[] a, int[] b, int k){
        if (a.length <= 0 || b.length <= 0){
            throw new IllegalArgumentException("You entered an empty or negative array");
        }
        for (int i = a.length - 1; i > b.length + k; i--) {
                a[i] = a[i - b.length];
        }
        for (int i = k + 1, j = 0; i < a.length && j < b.length; i++, j++) {
            a[i] = b[j];
        }
        return a;
    }
}
