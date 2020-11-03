package com.epam.kaliada.javaalgorithmization.decomposition;
//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
public class Task11 {
    public static int findNumberWithALotDigits(int a, int b){
        return (findCountDigitsInNumber(a) > findCountDigitsInNumber(b)) ? a : b;
    }

    private static int findCountDigitsInNumber(int a){
        return String.valueOf(a).length();
    }
}
