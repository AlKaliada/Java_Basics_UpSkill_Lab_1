package com.epam.kaliada.classes.simplestclasses.task7;

public class Triangle {
    private double[] coordinatesA = new double[2];
    private double[] coordinatesB = new double[2];
    private double[] coordinatesC = new double[2];

    public Triangle(double[] coordinatesA, double[] coordinatesB, double[] coordinatesC) {
        this.coordinatesA = coordinatesA;
        this.coordinatesB = coordinatesB;
        this.coordinatesC = coordinatesC;
    }

    public double[] getCoordinatesA() {
        return coordinatesA;
    }

    public double[] getCoordinatesB() {
        return coordinatesB;
    }

    public double[] getCoordinatesC() {
        return coordinatesC;
    }
}
