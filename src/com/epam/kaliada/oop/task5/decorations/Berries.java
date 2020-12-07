package com.epam.kaliada.oop.task5.decorations;

public class Berries extends DecorationsDecorator{
    private Decorations decoration;
    private double price = 1.7;

    public Berries(Decorations decoration) {
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
        return decoration.toString() + " berries,";
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
        Berries berries = (Berries) obj;
        if (!decoration.equals(berries.decoration)) return false;
        return price == berries.price;
    }
}
