package com.epam.kaliada.classes.aggregation.task2;

public class Engine {
    private String brand;
    private int power;

    public Engine(String brand, int power) {
        if (power > 0){
            this.brand = brand;
            this.power = power;
        }else {
            throw new IllegalArgumentException("Not valid data");
        }

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPower(int power) {
        if (power > 0){
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
