package com.epam.kaliada.javabasics.cycles;

import java.util.ArrayList;

//Вычислить значения функции на отрезке [а,b] c шагом h
public class Task2 {
    public static ArrayList<Double> calculateFunctionOnLineSegment(double a, double b, double h){
        ArrayList<Double> result = new ArrayList<>();
        for (double i = a; i <= b; i += h) {
            if(i > 2){
                result.add(i);
            }else {
                result.add(i * -1);
            }
        }
        return result;
    }
}
