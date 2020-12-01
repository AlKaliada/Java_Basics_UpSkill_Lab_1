package com.epam.kaliada.oop.task3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Holiday> holidays = new ArrayList<>();
    private List<LocalDate> weekends = new ArrayList<>();
    private int year;

    public Calendar(int year) {
        if (year < LocalDate.MIN.getYear() || year > LocalDate.MAX.getYear()){
            System.out.println("Year " + year + " doesn't exist");
            return;
        }
        this.year = year;
        addWeekends(year);
    }

    private void addWeekends(int year){
        LocalDate localDate = LocalDate.of(year, 1, 1);
        while (localDate.isBefore(LocalDate.of(year + 1, 1,1))){
            if (localDate.getDayOfWeek() == DayOfWeek.SATURDAY || localDate.getDayOfWeek() == DayOfWeek.SUNDAY){
                weekends.add(localDate);
            }
            localDate = localDate.plusDays(1);
        }
        for (LocalDate local : weekends) {
            System.out.println(local);
        }
    }

    public class Holiday{

    }
}
