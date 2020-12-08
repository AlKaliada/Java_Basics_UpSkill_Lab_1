package com.epam.kaliada.classes.aggregation.task2;

public class Wheel {
    private String brand;
    private double size;

    public Wheel(String brand, double size) {
        if (size > 0 && size <= 63){
            this.brand = brand;
            this.size = size;
        }else {
            throw new IllegalArgumentException("Not valid data");
        }

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(double size) {
        if (size > 0 && size <= 63){
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
