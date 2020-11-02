package com.epam.kaliada.javaalgorithmization.decomposition;
//Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
public class Task8 {
    public static void sumArraysElementsFromKToM(int[] array, int k, int m){
        if (k < 0 || m < 0 || array.length == 0 || k > (array.length - 3) || m > (array.length - 3)){
            throw new IllegalArgumentException("You entered wrong data");
        }
        int sum = 0;
        if (k < m){
            for (int i = k; i <= m; i++) {
                sum = sumThreeConsecutiveElementsOfArray(array, i);
                System.out.println("For index of element = " + i + " sum of three consecutive elements = " + sum);
            }
        }else {
            for (int i = m; i <= k; i++) {
                sum = sumThreeConsecutiveElementsOfArray(array, i);
                System.out.println("For index of element = " + i + " sum of three consecutive elements = " + sum);
            }
        }
    }

    private static int sumThreeConsecutiveElementsOfArray(int[] array, int k){
        int sum = 0;
        for (int i = k; i < (k + 3); i++) {
            sum += array[i];
        }
        return sum;
    }
}
