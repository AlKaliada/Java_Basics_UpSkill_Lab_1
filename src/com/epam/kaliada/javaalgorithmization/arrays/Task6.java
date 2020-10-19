package com.epam.kaliada.javaalgorithmization.arrays;
//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.
public class Task6 {
    public static void sumPrimeNumbersElements(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isNumberPrime(i)){
                sum += array[i];
            }
        }
        System.out.println("Sum elements which number is prime " + sum);
    }

    private static boolean isNumberPrime(int a){
        boolean isNumberPrime = true;
        int b = 2;
        while (b < a){
            if (a % b == 0){
                isNumberPrime = false;
                break;
            }
            b++;
        }
        if (a == 1){
            isNumberPrime = false;
        }
        return isNumberPrime;
    }
}
