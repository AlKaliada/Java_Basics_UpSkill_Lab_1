package com.epam.kaliada.classes.simplestclasses.task6;

public class Time {
    public static final int MAX_MINUTES = 60;
    public static final int MAX_SECONDS = 60;
    private int hours;
    private int minutes;
    private int seconds;

    public Time(){
    }
    public Time(int hours, int minutes, int seconds) {
        if (hours > 0){
            this.hours = hours;
        }
        if (minutes > 0 && minutes <= MAX_MINUTES){
            this.minutes = minutes;
        }
        if (seconds > 0 && seconds <= MAX_SECONDS){
            this.seconds = seconds;
        }
    }

    public void setHours(int hours) {
        this.hours = Math.max(hours, 0);

    }

    public void setMinutes(int minutes) {
        this.minutes = (minutes > 0 && minutes <= MAX_MINUTES) ? minutes : 0;
    }

    public void setSeconds(int seconds) {
        this.seconds = (seconds > 0 && seconds <= MAX_SECONDS) ? seconds : 0;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
    public void changeTimeByHours(int hours){
        this.hours = Math.max(this.hours += hours, 0);
    }
    public void changeTimeByMinutes(int minutes){
        this.minutes = ((this.minutes += minutes) > 0 && (this.minutes += minutes) <= MAX_MINUTES) ? (this.minutes += minutes) : 0;
    }
    public void changeTimeBySeconds(int seconds){
        this.seconds = ((this.seconds += seconds) > 0 && (this.seconds += seconds) <= MAX_SECONDS) ? (this.seconds += seconds) : 0;
    }
}
