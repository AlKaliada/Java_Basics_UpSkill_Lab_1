package com.epam.kaliada.basics_of_software_code_development.branching;

public class Task5 {
    public static double calculateFunctionTask5(double x){
        double z;
        if (x <= 3){
            z = x * x - 3 * x + 9;
        }else {
            z = 1 / (Math.pow(x, 3) + 6);
        }
        return z;
    }
}
