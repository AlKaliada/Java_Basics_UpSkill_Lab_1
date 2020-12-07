package com.epam.kaliada.oop.task5.decorations;

public class DefaultDecoration extends Decorations{

    @Override
    public String toString() {
        return "Decorations: ";
    }

    @Override
    public double cost() {
        return 0;
    }
}
