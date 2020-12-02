package com.epam.kaliada.oop.task3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(2020);
        LocalDate newYearDate = LocalDate.of(calendar.getYear(), 1, 1);
        Calendar.Holiday newYear = calendar.new Holiday(newYearDate, "New Year");
        newYear.addHoliday();
        LocalDate birthdayDate = LocalDate.of(calendar.getYear(), 3, 15);
        Calendar.Holiday birthday = calendar.new Holiday(birthdayDate, "Birthday");
        birthday.addHoliday();
        calendar.removeHoliday("Birthday");

    }
}
