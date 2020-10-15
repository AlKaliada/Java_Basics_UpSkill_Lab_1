package Basics_of_software_code_development.Branching;
//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
public class Task1 {
    public static String isCornerExist(double a, double b){
        if ((a + b) < 180){
            if (a == 90 || b == 90 || (180 - a - b) == 90){
                return "Треугольник существует, прямоугольный";
            }else {
                return "Треугольник существует, не прямоульный";
            }
        } else {
            return "Треугольник не существует";
        }
    }
}
