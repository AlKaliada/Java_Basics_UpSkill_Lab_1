package com.epam.kaliada.oop.task5.decorations;

public class Tape extends Decoration {
    private double price = 0.7;
    private int quantity;

    public Tape(int count) {
        this.quantity = count;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return super.toString() + " tape,";
    }

    @Override
    public double cost() {
        return quantity * price;
    }

    @Override
    public int hashCode() {
        int result = (int) price;
        result = 31 * result + quantity;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        Tape tape = (Tape) obj;
        if (quantity != tape.quantity) return false;
        return price == tape.price;
    }
}
