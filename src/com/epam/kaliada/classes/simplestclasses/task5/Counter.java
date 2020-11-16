package com.epam.kaliada.classes.simplestclasses.task5;

public class Counter {
    private static final int MIN = 0;
    private static final int MAX = 10;
    private int number;

    public Counter() {
    }

    public Counter(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    public void increment(){
        if (number++ <= MAX){
            number++;
        }
    }
    public void decriment(){
        if (number-- >= MIN){
            number--;
        }
    }
}
