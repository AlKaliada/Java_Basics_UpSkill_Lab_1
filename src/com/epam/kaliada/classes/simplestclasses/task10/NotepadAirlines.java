package com.epam.kaliada.classes.simplestclasses.task10;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class NotepadAirlines {
    private Airline[] airlines;

    public NotepadAirlines(Airline...airlines) {
        this.airlines = airlines;
    }

    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }
    
    public List<Airline> findAirlinesByDestination(String destination){
        if (destination == null || destination.length() == 0){
            throw new IllegalArgumentException("You entered null or empty destination");
        }
        List<Airline> airlinesResult = new ArrayList<>();
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDestination().toUpperCase().equals(destination.toUpperCase().trim())){
                airlinesResult.add(airlines[i]);
            }
        }
        return airlinesResult;
    }
    
    public List<Airline> findAirlinesByDayOfWeek(String dayOfWeek){
        if (dayOfWeek == null || dayOfWeek.length() == 0){
            throw new IllegalArgumentException("You entered null or empty day of week");
        }
        List<Airline> airlinesResult = new ArrayList<>();
        DaysOfWeek day = DaysOfWeek.valueOf(dayOfWeek.toUpperCase().trim());
        for (int i = 0; i < airlines.length; i++) {
            for (int j = 0; j < airlines[i].getDaysOfWeeks().length; j++) {
                if (airlines[i].getDaysOfWeeks()[j] == day){
                    airlinesResult.add(airlines[i]);
                    break;
                }
            }
        }
        return airlinesResult;
    }

    public List<Airline> findAirlinesByDayOfWeekAndLaterSpecifiedTime(LocalTime localTime, String dayOfWeek){
        if (dayOfWeek == null || dayOfWeek.length() == 0){
            throw new IllegalArgumentException("You entered null or empty day of week");
        }
        DaysOfWeek day = DaysOfWeek.valueOf(dayOfWeek.toUpperCase().trim());
        List<Airline> airlinesResult = new ArrayList<>();
        for (int i = 0; i < airlines.length; i++) {
            for (int j = 0; j < airlines[i].getDaysOfWeeks().length; j++) {
                if (airlines[i].getDaysOfWeeks()[j] == day && localTime.isBefore(airlines[i].getDepartureTime())){
                    airlinesResult.add(airlines[i]);
                    break;
                }
            }
        }
        return airlinesResult;
    }
    
    public List<Airline> findAirlinesByDayOfWeekAndLaterSpecifiedTime(LocalTime localTime, List<Airline> airlines){
        for (int i = 0; i < airlines.size(); i++) {
            if (airlines.get(i).getDepartureTime().isBefore(localTime)){
                airlines.remove(i);
            }
        }
        return airlines;
    }
}
