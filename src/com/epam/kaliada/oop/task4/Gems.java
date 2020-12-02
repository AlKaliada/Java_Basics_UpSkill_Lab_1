package com.epam.kaliada.oop.task4;

public class Gems extends Treasure{
    private GemsType gemsType;
    private double carats;

    public Gems(String name, double value, String description, GemsType gemsType, double carats) {
        super(name, value, description);
        this.gemsType = gemsType;
        this.carats = carats;
    }

    public GemsType getGemsType() {
        return gemsType;
    }

    public void setGemsType(GemsType gemsType) {
        this.gemsType = gemsType;
    }

    public double getCarats() {
        return carats;
    }

    public void setCarats(int carats) {
        this.carats = carats;
    }

    @Override
    public String toString() {
        return super.toString() + "; gems type- " + gemsType.toString().toLowerCase() + "; carats- " + carats;
    }
}
