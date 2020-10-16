package com.epam.kaliada.javabasics.linearprograms;

public class Task3 {
    public static double countFunction3(double x, double y){
        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        return z;
    }
}
