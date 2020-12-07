package com.epam.kaliada.oop.task4.treasures;

public abstract class Treasure implements Comparable<Treasure>{
    private String name;
    private double value;
    private String description;

    public Treasure(String name, double value, String description) {
        this.name = name;
        this.value = value;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int compareTo(Treasure o) {
        return Double.compare(this.value, o.value);
    }

    @Override
    public String toString() {
        return "name- " + name + "; value- " + value + "; description- " + description;
    }
}
