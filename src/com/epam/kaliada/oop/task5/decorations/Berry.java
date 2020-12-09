package com.epam.kaliada.oop.task5.decorations;

public class Berry extends Decoration {
    private double price = 1.7;
    private int quantity;

    public Berry(int count) {
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
        return super.toString() + quantity + " berries,";
    }

    @Override
    public double cost() {
        return quantity * price;
    }

    @Override
    public int hashCode() {
        int result = (int) price;
        result = result * 31 + quantity;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        Berry berries = (Berry) obj;
        if (quantity != berries.quantity) return false;
        return price == berries.price;
    }
}
