package com.epam.kaliada.classes.simplestclasses.task10;

import java.time.LocalTime;

public class AirlineCreator {
    public static Airline createAirline(String destination, String flightNumber, Plane plane, LocalTime departureTime, String...daysOfWeeks) {
        if (destination == null || flightNumber == null || departureTime == null || daysOfWeeks == null
        || destination.length() == 0 || flightNumber.length() == 0 || daysOfWeeks.length == 0){
            throw new IllegalArgumentException("You entered wrong data");
        }

        if (!flightNumber.matches("[A-Z]{2}\\d{4}")){
            throw new IllegalArgumentException("You entered wrong data");
        }

        for (int i = 0; i < daysOfWeeks.length; i++) {
            if (daysOfWeeks[i] == null || daysOfWeeks[i].length() == 0){
                throw new IllegalArgumentException("You entered wrong data");
            }else {
                daysOfWeeks[i] = daysOfWeeks[i].toUpperCase().trim();
            }
        }
        DayOfWeek[] days = new DayOfWeek[daysOfWeeks.length];
        for (int i = 0; i < days.length; i++) {
            days[i] = DayOfWeek.valueOf(daysOfWeeks[i]);
        }
        return new Airline(destination, flightNumber, plane, departureTime, days);
    }
}
