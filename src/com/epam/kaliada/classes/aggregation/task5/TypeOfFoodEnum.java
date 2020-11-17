package com.epam.kaliada.classes.aggregation.task5;

public enum TypeOfFoodEnum {
    WITHOUT(1.0), BREAKFASTS(1.2), BUFFET(1.8);
    private double coefficient;

    TypeOfFoodEnum(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }
}
