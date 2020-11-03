package com.epam.kaliada.javaalgorithmization.decomposition;
//Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
// последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
public class Task15 {
    public static void findNDigitNumbersDigitsFormingAnAscendingSequence(int n){
        if (n < 2){
            System.out.println("You entered wrong data, enter n more than 1");
            return;
        }
        for (int i = (int)Math.pow(10, (n - 1)); i <= ((int)Math.pow(10, n) - 1); i++) {
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
}
