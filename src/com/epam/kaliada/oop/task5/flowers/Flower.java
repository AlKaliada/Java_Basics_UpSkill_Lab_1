package com.epam.kaliada.oop.task5.flowers;

public class Flower {
    private String name;
    private double price;
    private int count;

    public Flower(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public double cost(){
        return price * count;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        if (obj == this) return true;
        Flower flower = (Flower) obj;
        if (price != flower.price) return false;
        if (count != flower.count) return false;
        return name != null ? name.equals(flower.name) : flower.name == null;
    }

    @Override
    public int hashCode() {
        int result = count;
        result = 31 * result + (int) price;
        result = 31* result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return count + " " + name + ", ";
    }
}
