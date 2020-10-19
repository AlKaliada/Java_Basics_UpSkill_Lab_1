package com.epam.kaliada.javaalgorithmization.arrays;

import java.util.Arrays;

//Даны действительные числа а1 ,а2 ,..., аn. Найти max(a1 + a2n, a2 + a(2n-1) .... an + a(n+1))
public class Task7 {
    public static void findMaxInNewArray(int[] a){
        int[] result = new int[a.length / 2];
        for (int i = 0; i < a.length / 2; i++) {
            result [i] = a[i] + a[a.length - 1 -i];
        }
        Arrays.sort(result);
        System.out.println(result[result.length - 1]);
    }
}
