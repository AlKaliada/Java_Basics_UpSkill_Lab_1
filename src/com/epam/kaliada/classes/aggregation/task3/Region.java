package com.epam.kaliada.classes.aggregation.task3;

import java.util.List;
import java.util.Objects;

public class Region {
    private String name;
    private List<District> districts;
    private City capital;

    public Region(String name, List<District> districts, City capital) {
        this.name = name;
        this.districts = districts;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public double countSquare(){
        double square = 0;
        for (District district : districts) {
            square += district.getSquare();
        }
        return square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return name.equals(region.name) &&
                districts.equals(region.districts) &&
                capital.equals(region.capital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, districts, capital);
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", districts=" + districts.size() +
                ", capital=" + capital.getName() +
                '}';
    }
}
