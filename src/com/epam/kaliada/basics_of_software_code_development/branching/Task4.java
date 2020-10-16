package com.epam.kaliada.basics_of_software_code_development.branching;
//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
public class Task4 {
    public static boolean isBrickWillPass(double A, double B, double x, double y, double z){
        if (x <= A && (y <= B || z <= B)){
            return true;
        }else if (y <= A && (x <= B || z <= B)){
            return true;
        }else if (z <= A && (x <= B || y <= B)){
            return true;
        }else {
            return false;
        }
    }
}
