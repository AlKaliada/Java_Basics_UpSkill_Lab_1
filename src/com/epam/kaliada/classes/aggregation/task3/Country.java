package com.epam.kaliada.classes.aggregation.task3;

import java.util.List;
import java.util.Objects;

public class Country {
    private String name;
    private List<Region> regions;
    private City capital;



    public Country(String name, List<Region> regions, City capital) {
        this.name = name;
        this.regions = regions;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }
    public double countSquare(){
        double square = 0;
        for (Region region : regions) {
            square += region.countSquare();
        }
        return square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return name.equals(country.name) &&
                regions.equals(country.regions) &&
                capital.equals(country.capital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, regions, capital);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", regions=" + regions.size() +
                ", capital=" + capital.getName() +
                '}';
    }
}
