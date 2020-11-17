package com.epam.kaliada.classes.aggregation.task5;

public enum TypeOfTourEnum {
    RECREATION(1.00), EXCURSIONS(1.5), TREATMENT(2.0), SHOPPING(1.1), CRUISE(2.5);
    private double coefficient;

    TypeOfTourEnum(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }
}
