package com.epam.kaliada.classes.simplestclasses.task7;

import java.util.Arrays;

//Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
// вычисления площади, периметра и точки пересечения медиан.
public class Main {
    public static void main(String[] args) {
        TriangleCreator triangleCreator = new TriangleCreator();
        double[] a = {0.0, 0.0};
        double[] b = {0.0, 1.0};
        double[] c = {1.0, 1.0};
        Triangle triangle = triangleCreator.createTriangle(a,b,c);
        System.out.println(Arrays.toString(triangleCreator.calculateCentroid(triangle)));
        System.out.println(triangleCreator.calculateTrianglePerimeter(triangle));
        System.out.println(triangleCreator.calculateTriangleSquare(triangle));

    }
}
