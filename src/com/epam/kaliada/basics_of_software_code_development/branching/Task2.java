package com.epam.kaliada.basics_of_software_code_development.branching;
//Найти max{min(a, b), min(c, d)}.
public class Task2 {
    public static int findMax(int a, int b, int c, int d){
        int min1 = a;
        int min2 = c;
        if (a < b){
            min1 = a;
        }else {
            min1 = b;
        }
        if (c < d){
            min2 = c;
        }else {
            min2 = d;
        }

        if (min1 > min2){
            return min1;
        }else {
            return min2;
        }
    }
}
