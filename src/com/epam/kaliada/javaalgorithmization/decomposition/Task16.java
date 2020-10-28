package com.epam.kaliada.javaalgorithmization.decomposition;
//Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
public class Task16 {
    public static void findSumNDigitNumbersWithNotEvenDigits(int n){
        if (n < 1){
            System.out.println("You entered wrong data, enter n more than 0");
            return;
        }
        int firstNDigitNumber = findFirstNDigitNumber(n);
        int lastNDigitNumber = findLastNDigitNumber(n);
        int sum = 0;
        for (int i = firstNDigitNumber; i <= lastNDigitNumber; i++) {
            if (isNumberConsistOnlyNotEvenDigits(i)){
                sum += i;
            }
        }
        printSumAndValueEvenDigitsInSum(sum, n);
    }

    private static boolean isNumberConsistOnlyNotEvenDigits(int number){
        String stringNumber = String.valueOf(number);
        for (int i = 0; i < stringNumber.length(); i++) {
            if ((number % 10) % 2 == 0){
                return false;
            }
            number /= 10;
        }
        return true;
    }
    private static int countEvenDigitsInNumber(int number){
        int count = 0;
        String stringNumber = String.valueOf(number);
        for (int i = 0; i < stringNumber.length(); i++) {
            if ((number % 10) % 2 == 0){
                count++;
            }
            number /= 10;
        }
        return count;
    }
    private static int findFirstNDigitNumber(int number){
        int firstNDigitNumber = 1;
        for (int i = 0; i < (number - 1); i++) {
            firstNDigitNumber *= 10;
        }
        return firstNDigitNumber;
    }
    private static int findLastNDigitNumber(int number){
        int LastNDigitNumber = 1;
        for (int i = 0; i < number; i++) {
            LastNDigitNumber *= 10;
        }
        return LastNDigitNumber - 1;
    }
    private static void printSumAndValueEvenDigitsInSum(int sum, int n){
        System.out.println("Sum " + n + "-digit numbers with not even digits is " + sum);
        System.out.println("Sum consist " + countEvenDigitsInNumber(sum) + " even digits");
    }
}
