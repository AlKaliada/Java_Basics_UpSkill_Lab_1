package com.epam.kaliada.javaalgorithmization.decomposition;
//На плоскости заданы своими координатами n точек.
// Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
public class Task4 {
    public static void findMinimumDistanceBetweenDots(double ...a){
        if (a.length < 4 || (a.length % 2 != 0)){
            System.out.println("You entered a wrong data");
            return;
        }
        int numberOfFirstDot = 1;
        int numberOfSecondDot = 2;
        double biggestDistanceBetweenDots = 0;
        double distanceBetweenDots;

        for (int i = 0; i < (a.length - 2); i += 2) {
            for (int j = 2; j < a.length; j += 2) {
                distanceBetweenDots = findDistanceBetweenTwoDots(a[i], a[i + 1], a[j], a[j + 1]);
                if (distanceBetweenDots > biggestDistanceBetweenDots){
                    biggestDistanceBetweenDots = distanceBetweenDots;
                    numberOfFirstDot = i / 2 + 1;
                    numberOfSecondDot = j / 2 +1;
                }
            }
        }
        System.out.println("The biggest distance is between dot № " + numberOfFirstDot + " and dot № " + numberOfSecondDot);
    }

    private static double findDistanceBetweenTwoDots(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
