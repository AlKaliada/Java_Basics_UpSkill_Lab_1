package com.epam.kaliada.classes.simplestclasses.task4;


import java.time.LocalTime;

public class Train implements Comparable<Train>{
    private String destination;
    private int trainNumber;
    private LocalTime departureTime;

    public Train(String destination, int trainNumber, LocalTime departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    @Override
    public int compareTo(Train o) {
        int result = this.getDestination().toLowerCase().compareTo(o.getDestination().toLowerCase());
        if (result == 0){
            result = this.getDepartureTime().compareTo(o.getDepartureTime());
        }
        return result;
    }
}
