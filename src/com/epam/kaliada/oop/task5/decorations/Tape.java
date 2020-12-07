package com.epam.kaliada.oop.task5.decorations;

public class Tape extends DecorationsDecorator{
    private Decorations decoration;
    private double price = 0.7;

    public Tape(Decorations decoration) {
        this.decoration = decoration;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return decoration.toString() + " tape,";
    }

    @Override
    public double cost() {
        return decoration.cost() + price;
    }
}
