package com.epam.kaliada.javaalgorithmization.arrays;
//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.
public class Task6 {
    public static void sumPrimeNumbersElements(double[] array){
        if (array.length <= 0){
            System.out.println("Wrong length of array");
            return;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isNumberPrime(i)){
                sum += array[i];
            }
        }
        System.out.println("Sum elements which number is prime " + sum);
    }

    private static boolean isNumberPrime(int a){
        if (a < 2){
            return false;
        }else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
