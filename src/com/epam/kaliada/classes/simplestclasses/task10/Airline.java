package com.epam.kaliada.classes.simplestclasses.task10;

import java.time.LocalTime;
import java.util.Arrays;

public class Airline {
    private String destination;
    private String flightNumber;
    private Plane plane;
    private LocalTime departureTime;
    private DayOfWeek[] daysOfWeeks;

    public Airline(String destination, String flightNumber, Plane plane, LocalTime departureTime, DayOfWeek[] daysOfWeeks) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.plane = plane;
        this.departureTime = departureTime;
        this.daysOfWeeks = daysOfWeeks;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfWeek[] getDaysOfWeeks() {
        return daysOfWeeks;
    }

    public void setDaysOfWeeks(DayOfWeek[] daysOfWeeks) {
        this.daysOfWeeks = daysOfWeeks;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", plane=" + plane.getPlaneProducer() + plane.getModel() +
                ", departureTime=" + departureTime +
                ", daysOfWeeks=" + Arrays.toString(daysOfWeeks) +
                '}';
    }
}
