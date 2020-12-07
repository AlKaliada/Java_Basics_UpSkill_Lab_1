package com.epam.kaliada.classes.aggregation.task3;

import java.util.Objects;

public class City {
    private String name;
    private int population;
    private double square;

    public City(String name, int population, double square) {
        if (population > 0 && square > 0){
            this.name = name;
            this.population = population;
            this.square = square;
        }else {
            throw new IllegalArgumentException("Not valid data");
        }

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
        if (population > 0){
            this.population = population;
        }else {
            throw new IllegalArgumentException("Not valid data");
        }

    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        if (square > 0){
            this.square = square;
        }else {
            throw new IllegalArgumentException("Not valid data");
        }

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
