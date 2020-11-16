package com.epam.kaliada.classes.aggregation.task3;

import java.util.List;
import java.util.Objects;

public class District {
    private String name;
    private double square;
    private List<City> cities;
    private City capital;

    public District(String name, double square, List<City> cities, City capital) {
        this.name = name;
        this.square = square;
        this.cities = cities;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Double.compare(district.square, square) == 0 &&
                name.equals(district.name) &&
                cities.equals(district.cities) &&
                capital.equals(district.capital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, square, cities, capital);
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", square=" + square +
                ", cities=" + cities.size() +
                ", capital=" + capital.getName() +
                '}';
    }
}
