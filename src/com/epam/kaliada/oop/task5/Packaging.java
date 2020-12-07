package com.epam.kaliada.oop.task5;

public enum Packaging {
    BASKET(15.0), PAPER(2.5), BOX(9.9);
    private final double price;
    Packaging(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
