package com.epam.kaliada.javaalgorithmization.sorting;
//Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя дополнительный массив.
public class Task1 {
    public static int[] combiningArrays(int[] a, int[] b, int k){
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
}
