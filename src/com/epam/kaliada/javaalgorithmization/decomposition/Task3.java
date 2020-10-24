package com.epam.kaliada.javaalgorithmization.decomposition;
//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
public class Task3 {
    public static double findSquareOfHexagon(int a){
        if (a <= 0){
            throw new IllegalArgumentException("You entered a wrong data");
        }
    return findSquareOfEquilateralTriangle(a) * 6;
    }

    private static double findSquareOfEquilateralTriangle(int a){
        return Math.sqrt(3) / 4 * a * a;
    }
}
