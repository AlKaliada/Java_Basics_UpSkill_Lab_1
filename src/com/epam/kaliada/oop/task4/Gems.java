package com.epam.kaliada.oop.task4;

public class Gems extends Treasure{
    private GemsType gemsType;
    private int carats;

    public Gems(String name, double value, String description, GemsType gemsType, int carats) {
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

    public int getCarats() {
        return carats;
    }

    public void setCarats(int carats) {
        this.carats = carats;
    }

    @Override
    public String toString() {
        return super.toString() + " " + gemsType.toString() + " " + carats + " carats";
    }
}
