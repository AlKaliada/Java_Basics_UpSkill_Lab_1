package com.epam.kaliada.javaalgorithmization.decomposition;
//Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
// возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
public class Task14 {
    public static void findArmstrongNumbers(int k){
        if (k < 1){
            System.out.println(k + " is not a natural");
            return;
        }
        for (int i = 0; i < k; i++) {
            if (isArmstrongNumber(i)){
                printArmstrongNumber(i);
            }
        }

    }
    private static int[] findDigitsOfNumber(int number){
        String numberString = String.valueOf(number);
        int[] result = new int[numberString.length()];
        for (int i = 0; i < numberString.length(); i++) {
            result[i] = number % 10;
            number /= 10;
        }
        return result;
    }

    private static boolean isArmstrongNumber(int number){
        int sum = 0;
        int[] arrayOfDigits = findDigitsOfNumber(number);
        for (int i = 0; i < arrayOfDigits.length; i++) {
            sum += Math.pow(arrayOfDigits[i], arrayOfDigits.length);
        }
        return number == sum;
    }
    private static void printArmstrongNumber(int number){
        System.out.println(number + " is Armstrong number");
    }
}
