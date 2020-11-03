package com.epam.kaliada.javaalgorithmization.decomposition;
//Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N
public class Task10 {
    public static int[] createArrayWithDigitsFromNumber(int n){
        if (n < 0){
            throw new IllegalArgumentException("You entered wrong data");
        }

        int[] array = new int[findLengthOfNumber(n)];
        for (int i = (array.length - 1); i >= 0; i--) {
            array[i] = n % 10;
            n /= 10;
        }
//
        return array;
    }

    private static int findLengthOfNumber(int number){

        return String.valueOf(number).length();
    }
}
