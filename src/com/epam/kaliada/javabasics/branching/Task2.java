package com.epam.kaliada.javabasics.branching;
//Найти max{min(a, b), min(c, d)}.
public class Task2 {
    public static int findMax(int a, int b, int c, int d){
        int min1 = a;
        int min2 = c;
        if (b < a) {
            min1 = b;
        }
        if (d < c){
            min2 = d;
        }
        int result = (min1 > min2) ? min1 : min2;
        return result;
    }
}
