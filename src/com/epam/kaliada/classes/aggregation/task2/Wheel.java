package com.epam.kaliada.classes.aggregation.task2;

public class Wheel {
    private final String brand;
    private final double size;

    public Wheel(String brand, double size) {
        if (size > 0 && size <= 63){
            this.brand = brand;
            this.size = size;
        }else {
            throw new IllegalArgumentException("Not valid data");
        }

    }

    public String getBrand() {
        return brand;
    }

    public double getSize() {
        return size;
    }
}
