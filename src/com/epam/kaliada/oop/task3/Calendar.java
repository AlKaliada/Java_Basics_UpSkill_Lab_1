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

    public List<Holiday> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<Holiday> holidays) {
        this.holidays = holidays;
    }

    public List<LocalDate> getWeekends() {
        return weekends;
    }

    public void setWeekends(List<LocalDate> weekends) {
        this.weekends = weekends;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private void addWeekends(int year){
        LocalDate localDate = LocalDate.of(year, 1, 1);
        while (localDate.isBefore(LocalDate.of(year + 1, 1,1))){
            if (localDate.getDayOfWeek() == DayOfWeek.SATURDAY || localDate.getDayOfWeek() == DayOfWeek.SUNDAY){
                weekends.add(localDate);
            }
            localDate = localDate.plusDays(1);
        }
    }

    public void removeHoliday(LocalDate localDate){
        for (Holiday holiday : holidays) {
            if (holiday.getLocalDate() == localDate){
                holidays.remove(holiday);
                break;
            }
        }
    }

    public void removeHoliday(String name){
        for (Holiday holiday : holidays) {
            if (holiday.getName().equals(name)){
                holidays.remove(holiday);
                break;
            }
        }
    }

    public class Holiday{
        private LocalDate localDate;
        private String name;

        public Holiday(LocalDate localDate, String name) {
            this.localDate = localDate;
            this.name = name;
        }

        public LocalDate getLocalDate() {
            return localDate;
        }

        public void setLocalDate(LocalDate localDate) {
            this.localDate = localDate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void addHoliday(){
            if (checkHoliday()){
                System.out.println("The holiday on this day is already exist");
                return;
            }
            holidays.add(this);
        }
        private boolean checkHoliday(){
            boolean isHolidayExist = false;
            for (Holiday holiday : holidays) {
                if (holiday.getLocalDate() == this.getLocalDate()){
                    isHolidayExist = true;
                    break;
                }
            }
            return isHolidayExist;
        }

        @Override
        public String toString() {
            return "Holiday{" +
                    "localDate=" + localDate +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
