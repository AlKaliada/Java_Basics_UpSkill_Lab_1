package com.epam.kaliada.javaalgorithmization.decomposition;
//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми
public class Task6 {
    public static boolean isCoprimeIntegers(int a, int b, int c){

        return findGreatestCommonDivisor(findGreatestCommonDivisor(b,c), a) == 1;
    }

    private static int findGreatestCommonDivisor(int c, int d){
        if (c == 0 || d == 0){
            throw new IllegalArgumentException("Greatest common divisor for 0 doesn't exist");
        }
        int a = Math.abs(c);
        int b = Math.abs(d);
        int greatestCommonDivisor;
        if (a < b){
            greatestCommonDivisor = a;
        }else {
            greatestCommonDivisor = b;
        }
        while (greatestCommonDivisor > 0){
            if ((a % greatestCommonDivisor) == 0 && (b % greatestCommonDivisor) == 0){
                return greatestCommonDivisor;
            }
            greatestCommonDivisor--;
        }
        return greatestCommonDivisor;
    }

}
