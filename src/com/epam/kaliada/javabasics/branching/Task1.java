package com.epam.kaliada.javabasics.branching;
//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
public class Task1 {
    public static String defineTriangle(double a, double b){
        if ((a + b) >= 180){
            return "Треугольник не существует";
        }

        if (a == 90 || b == 90 || (180 - a - b) == 90){
            return "Треугольник существует, прямоугольный";
        } else {
            return "Треугольник существует, не прямоульный";
        }
    }
}
