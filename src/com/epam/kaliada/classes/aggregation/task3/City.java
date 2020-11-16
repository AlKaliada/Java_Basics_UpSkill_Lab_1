package com.epam.kaliada.classes.aggregation.task3;

import java.util.Objects;

public class City {
    private String name;
    private int population;
    private double square;

    public City(String name, int population, double square) {
        this.name = name;
        this.population = population;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return population == city.population &&
                Double.compare(city.square, square) == 0 &&
                name.equals(city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population, square);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", square=" + square +
                '}';
    }
}
