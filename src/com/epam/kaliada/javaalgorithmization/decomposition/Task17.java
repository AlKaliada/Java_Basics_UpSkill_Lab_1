package com.epam.kaliada.javaalgorithmization.decomposition;
//Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
public class Task17 {
    public static void countSubtractSumOfDigitsFromNumber(int number){
        if (number < 0){
            System.out.println(number + " is negative number, enter positive number");
            return;
        }
        int count = 0;
        while (number > 0){
            number -= findSumOfDigits(number);
            count++;
        }
        System.out.println(count);
    }
    private static int findSumOfDigits(int number){
        String stringNumber = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < stringNumber.length(); i++) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
