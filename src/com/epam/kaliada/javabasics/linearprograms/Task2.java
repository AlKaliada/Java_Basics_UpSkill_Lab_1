package com.epam.kaliada.javabasics.linearprograms;

public class Task2 {
    public static double countFunction2(double a, double b, double c){
        double z = (b + Math.sqrt(Math.pow(b,2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) + Math.pow(b, -2);
        return z;
    }
}
