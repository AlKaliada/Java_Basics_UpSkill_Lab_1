package com.epam.kaliada.javaalgorithmization.arrays;



// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.
public class Task9 {
    public static int findMoreFrequentNumberInArray(int[] a){
        int maxFrequent = 0;
        int maxFrequentNumber = a[0];
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]){
                    count++;
                }
            }
            if (count > maxFrequent){
                maxFrequent = count;
                maxFrequentNumber = a[i];
            }else if (count == maxFrequent && a[i] < maxFrequentNumber){
                maxFrequentNumber = a[i];
            }
        }
        return maxFrequentNumber;
    }
}
