package com.epam.kaliada.javaalgorithmization.onedimensionalarrays;
//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
public class Task3 {
    public static void countNegativePositiveAndZeroElements(int[] a){
        int positiveElements = 0;
        int negativeElements = 0;
        int zeroElements = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0){
                positiveElements++;
            }else if (a[i] < 0){
                negativeElements++;
            }else {
                zeroElements++;
            }
        }
        System.out.println("Positive elements " + positiveElements + "\n" + "Negative elements " + negativeElements +
                "\n" + "Zero elements " + zeroElements);
    }
}
