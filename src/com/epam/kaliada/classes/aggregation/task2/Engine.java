package com.epam.kaliada.classes.aggregation.task2;

public class Engine {
    private final String brand;
    private final int power;

    public Engine(String brand, int power) {
        if (power > 0){
            this.brand = brand;
            this.power = power;
        }else {
            throw new IllegalArgumentException("Not valid data");
        }

    }

    public String getBrand() {
        return brand;
    }

    public int getPower() {
        return power;
    }
}
