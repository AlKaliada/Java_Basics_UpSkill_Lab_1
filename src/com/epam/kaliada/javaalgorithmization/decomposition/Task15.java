package com.epam.kaliada.javaalgorithmization.decomposition;
//Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
// последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
public class Task15 {
    public static void findNDigitNumbersDigitsFormingAnAscendingSequence(int n){
        if (n < 1){
            System.out.println("You entered wrong data, enter n more than 0");
            return;
        }
        for (int i = findFirstNDigitNumber(n); i <= findLastNDigitNumber(n); i++) {
            if (checkNumberConsistsOfDigitsFormingAnAscendingSequence(i)){
                System.out.println(i);
            }
        }
    }
    private static boolean checkNumberConsistsOfDigitsFormingAnAscendingSequence(int number){
        String stringNumber = String.valueOf(number);
        if (stringNumber.length() == 1){
            return false;
        }
        for (int i = 0; i < (stringNumber.length() - 1); i++) {
            int digit = number % 10;
            number /= 10;
            int digitNext = number % 10;
            if (digitNext >= digit){
                return false;
            }
        }
        return true;
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
}
