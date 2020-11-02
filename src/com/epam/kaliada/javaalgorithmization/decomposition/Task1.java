package com.epam.kaliada.javaalgorithmization.decomposition;
//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел
public class Task1 {
    public static int findLeastCommonMultiple(int a, int b){
        if (a < 0 || b < 0){
            throw new IllegalArgumentException("You entered not a natural number");
        }else if (a == 0 || b == 0){
            throw new IllegalArgumentException("Least common multiple for 0 doesn't exist");
        }
       return a * b / findGreatestCommonDivisor(a, b);

    }

    public static int findGreatestCommonDivisor(int a, int b){
        if (a < 0 || b < 0){
            throw new IllegalArgumentException("You entered not a natural number");
        }else if (a == 0 || b == 0){
            throw new IllegalArgumentException("Greatest common divisor for 0 doesn't exist");
        }
        int greatestCommonDivisor = (a < b) ? a : b;

        while (greatestCommonDivisor > 0){
            if ((a % greatestCommonDivisor) == 0 && (b % greatestCommonDivisor) == 0){
                return greatestCommonDivisor;
            }
            greatestCommonDivisor--;
        }
        return greatestCommonDivisor;
    }
}
