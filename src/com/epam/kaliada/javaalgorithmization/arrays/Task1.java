package com.epam.kaliada.javaalgorithmization.arrays;
//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
public class Task1 {
    public static void findSumElementsOfArray(int[] a, int k){
        if (a.length <= 0){
            System.out.println("Wrong length of array");
            return;
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0){
                sum += a[i];
            }
        }
        System.out.println("Sum elements multiples of " + k + " - " + sum);
    }
}
