package com.epam.kaliada.javaalgorithmization.decomposition;
//Даны числа X, Y, Z, Т — длины сторон четырехугольника.
// Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
public class Task9 {
    public static double findQuadrilateralSquare(double x, double y, double z, double t){
        return x * y / 2 + findTriangleSquare(findSideOfRightTriangle(x, y), z, t);
    }

    private static double findTriangleSquare(double a, double b, double c){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private static double findSideOfRightTriangle(double a, double b){
        return Math.sqrt(a * a + b * b);
    }
}
