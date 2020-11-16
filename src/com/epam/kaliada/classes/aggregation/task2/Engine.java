package com.epam.kaliada.classes.aggregation.task2;

public class Engine {
    private final String brand;
    private final int power;

    public Engine(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public int getPower() {
        return power;
    }
}
