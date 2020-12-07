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

    @Override
    public int hashCode() {
        int result = (int) price;
        result = 31 * result + (decoration != null ? decoration.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        Tape tape = (Tape) obj;
        if (!decoration.equals(tape.decoration)) return false;
        return price == tape.price;
    }
}
