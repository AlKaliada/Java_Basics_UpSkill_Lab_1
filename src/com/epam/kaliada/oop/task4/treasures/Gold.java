package com.epam.kaliada.oop.task4.treasures;

public class Gold extends Treasure {
    private int goldContent;

    public Gold(String name, double value, String description, int goldContent) {
        super(name, value, description);
        this.goldContent = goldContent;
    }

    public int getGoldContent() {
        return goldContent;
    }

    public void setGoldContent(int goldContent) {
        this.goldContent = goldContent;
    }

    @Override
    public String toString() {
        return super.toString() + "; gold content- " + goldContent;
    }
}
