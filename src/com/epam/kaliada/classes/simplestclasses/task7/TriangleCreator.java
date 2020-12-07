package com.epam.kaliada.classes.simplestclasses.task7;

public class TriangleCreator {
    public Triangle createTriangle(double[] a, double[] b, double[] c){
        if (a == null || b == null || c == null || a.length != 2 || b.length !=2 || c.length != 2){
            throw new IllegalArgumentException("You entered wrong data");
        }
        if (isTriangleExist(a, b, c)){
            return new Triangle(a, b, c);
        }else {
            throw new IllegalArgumentException("triangle with such coordinates does not exist");
        }
    }

    public static boolean isTriangleExist(double[] a, double[] b, double[] c){
        double distanceAB = calculateDistanceBetweenDots(a, b);
        double distanceAC = calculateDistanceBetweenDots(a, c);
        double distanceBC = calculateDistanceBetweenDots(b, c);
        return (((distanceAB + distanceAC) > distanceBC) && ((distanceAC + distanceBC) > distanceAB) && ((distanceAB + distanceBC) > distanceAC));
    }

    public static double calculateDistanceBetweenDots(double[] a, double[] b){
        return Math.sqrt((b[0] - a[0]) * (b[0] - a[0]) + (b[1] - a[1]) * (b[1] - a[1]));
    }

    public double calculateTriangleSquare(Triangle triangle){
        double p = calculateTrianglePerimeter(triangle) / 2;
        double distanceAB = calculateDistanceBetweenDots(triangle.getCoordinatesA(), triangle.getCoordinatesB());
        double distanceAC = calculateDistanceBetweenDots(triangle.getCoordinatesA(), triangle.getCoordinatesC());
        double distanceBC = calculateDistanceBetweenDots(triangle.getCoordinatesB(), triangle.getCoordinatesC());
        return Math.sqrt(p * (p - distanceAB) * (p - distanceAC) * (p - distanceBC));
    }

    public double calculateTrianglePerimeter(Triangle triangle){
        double distanceAB = calculateDistanceBetweenDots(triangle.getCoordinatesA(), triangle.getCoordinatesB());
        double distanceAC = calculateDistanceBetweenDots(triangle.getCoordinatesA(), triangle.getCoordinatesC());
        double distanceBC = calculateDistanceBetweenDots(triangle.getCoordinatesB(), triangle.getCoordinatesC());
        return distanceAB + distanceAC + distanceBC;
    }

    public double[] calculateCentroid(Triangle triangle){
        double[] centroid = new double[2];
        centroid[0] = (double) 1 / 3 * (triangle.getCoordinatesA()[0] + triangle.getCoordinatesB()[0] + triangle.getCoordinatesC()[0]);
        centroid[1] = (double) 1 / 3 * (triangle.getCoordinatesA()[1] + triangle.getCoordinatesB()[1] + triangle.getCoordinatesC()[1]);
        return centroid;
    }


}
