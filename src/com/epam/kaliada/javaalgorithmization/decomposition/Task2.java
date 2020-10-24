package com.epam.kaliada.javaalgorithmization.decomposition;
//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
public class Task2 {
    public static int findGreatestCommonDivisorForFourNumbers(int a, int b, int c, int d) {
        if (a < 0 || b < 0 || c < 0 || d < 0) {
            throw new IllegalArgumentException("You entered not a natural number");
        } else if (a == 0 || b == 0 || c == 0 || d == 0) {
            throw new IllegalArgumentException("Greatest common divisor for 0 doesn't exist");
        }
        return findGreatestCommonDivisor(findGreatestCommonDivisor(a, b), findGreatestCommonDivisor(c, d));


    }

    private static int findGreatestCommonDivisor(int a, int b){

        int greatestCommonDivisor;
        if (a < b){
            greatestCommonDivisor = a;
        }else {
            greatestCommonDivisor = b;
        }
        while (greatestCommonDivisor > 0){
            if (a % greatestCommonDivisor == 0 && b % greatestCommonDivisor == 0){
                return greatestCommonDivisor;
            }
            greatestCommonDivisor--;
        }
        return greatestCommonDivisor;
    }
}
