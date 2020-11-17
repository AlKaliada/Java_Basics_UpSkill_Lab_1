package com.epam.kaliada.classes.aggregation.task5;

public enum TransportEnum {
    BUS(1.0), PLANE(2.0), TRAIN(1.5);
    private double coefficient;

    TransportEnum(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }
}
