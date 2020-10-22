package com.epam.kaliada.javaalgorithmization.arrays;


//Даны действительные числа а1 ,а2 ,..., аn. Найти max(a1 + a2n, a2 + a(2n-1) .... an + a(n+1))
public class Task7 {
    public static void findMaxInNewArray(double[] a){
        if (a.length <= 0 || a.length % 2 != 0){
            System.out.println("Wrong length of array");
            return;
        }
        double[] result = new double[a.length / 2];
        for (int i = 0; i < a.length / 2; i++) {
            result [i] = a[i] + a[a.length - 1 -i];
        }
        double max = result[0];
        for (int i = 0; i < result.length; i++) {
            max = result[i] > max ? result[i] : max;
        }

        System.out.println(max);
    }
}
