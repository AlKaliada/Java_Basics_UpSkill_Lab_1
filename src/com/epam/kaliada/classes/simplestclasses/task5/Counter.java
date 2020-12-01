package com.epam.kaliada.classes.simplestclasses.task5;

public class Counter {
    private static final int MIN = 0;
    private static final int MAX = 9;
    private int number;

    public Counter() {
    }

    public Counter(int number) {
        if (number >= MIN && number <= MAX){
            this.number = number;
        }else {
            number = MIN;
        }
    }

    public int getNumber() {
        return number;
    }
    public void increment(){
        if (number++ <= MAX){
            number++;
        }else {
            number = MAX;
        }
    }
    public void decriment(){
        if (number-- >= MIN){
            number--;
        }else {
            number = MIN;
        }
    }
}
