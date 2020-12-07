package com.epam.kaliada.oop.task5.decorations;

public class Butterflies extends DecorationsDecorator{
    private Decorations decoration;
    private double price = 1.1;

    public Butterflies(Decorations decoration) {
        this.decoration = decoration;
    }
    public Butterflies(Decorations decoration, int count){
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
        return decoration.toString() + " butterflies,";
    }

    @Override
    public double cost() {
        return decoration.cost() + price;
    }

    @Override
    public int hashCode() {
        int result = (int) price;
        result = result * 31 + (decoration != null ? decoration.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        Butterflies butterflies = (Butterflies) obj;
        if (!decoration.equals(butterflies.decoration)) return false;
        return price == butterflies.price;
    }
}
