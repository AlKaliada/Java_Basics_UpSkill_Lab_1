package com.epam.kaliada.javaalgorithmization.decomposition;
//Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N
public class Task10 {
    public static int[] createArrayWithDigitsFromNumber(int n){
        if (n < 0){
            throw new IllegalArgumentException("You entered wrong data");
        }
        String stringNumber = String.valueOf(n);
        int[] array = new int[stringNumber.length()];
        for (int i = 0; i < stringNumber.length(); i++) {
            array[i] = extractDigitsFromNumber(i, n);
        }
        return array;
    }

    private static int extractDigitsFromNumber(int numberDigit, int number){
        String stringNumber = String.valueOf(number);
        int digit = 0;
        for (int i = 0; i < stringNumber.length() - numberDigit; i++) {
            digit = number % 10;
            number /= 10;
        }


        return digit;
    }
}
