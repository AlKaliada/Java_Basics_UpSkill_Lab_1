package com.epam.kaliada.javaalgorithmization.decomposition;
//Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
// элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
public class Task12 {
    public static int[] arrayCreate(int k, int n){
        if (k <= 0 || n <= 0){
            throw new IllegalArgumentException("You entered not a natural number");
        }
        int[] array = new int[findArrayLength(k, n)];
        for (int i = 0, j = 0; i < array.length && j <=n; j++) {
            if (findSumOfDigitsInNumber(j) == k){
                array[i] = j;
                i++;
            }
        }
        return array;
    }
    
    private static int findArrayLength(int k, int n){
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (findSumOfDigitsInNumber(i) == k){
                count++;
            }
        }
        return count;
    }
    private static int findSumOfDigitsInNumber(int number){
        String numberString = String.valueOf(number);
        int sumOfDigits = 0;
        int digit;
        for (int i = 0; i < numberString.length(); i++) {
            digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }
        return sumOfDigits;
    }
}
