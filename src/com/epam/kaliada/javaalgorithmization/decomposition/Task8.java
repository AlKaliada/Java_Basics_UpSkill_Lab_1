package com.epam.kaliada.javaalgorithmization.decomposition;
//Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
public class Task8 {
    public static int sumArraysElementsFromKToM(int[] array, int k, int m){
        if (k < 0 || m < 0 || array.length == 0 || k > (array.length - 1) || m > (array.length - 1)){
            throw new IllegalArgumentException("You entered wrong data");
        }
        int sum = 0;
        if (k < m){
            for (int i = k; i <= m; i++) {
                sum += array[i];
            }
        }else {
            for (int i = m; i <= k; i++) {
                sum += array[i];
            }
        }
        return sum;
    }
}
