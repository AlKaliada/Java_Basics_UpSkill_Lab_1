package com.epam.kaliada.classes.simplestclasses.task10;

import java.time.LocalTime;
import java.util.List;

//Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
// toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//
//Найти и вывести:
//
//a) список рейсов для заданного пункта назначения;
//
//b) список рейсов для заданного дня недели;
//
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
public class Main {
    public static void main(String[] args) {
        try{
            Plane plane1 = new Plane(PlaneProducer.AIRBUS, "A320");
            Plane plane2 = new Plane(PlaneProducer.BOEING, "747");
            Plane plane3 = new Plane(PlaneProducer.BOEING, "787");

            AirlineCreator airlineCreator = new AirlineCreator();
            Airline airline = airlineCreator.createAirline("Moscow", "FR2365", plane1, "13:56", "monday", "friday");
            Airline airline1 = airlineCreator.createAirline("Moscow", "TR6532", plane2, "17:44", "tuesday", "wednesday");
            Airline airline2 = airlineCreator.createAirline("Stockholm", "GF9812", plane3, "22:01", "wednesday", "sunday");
            Airline airline3 = airlineCreator.createAirline("Kyiv", "JK3478", plane2, "08:15", "tuesday", "friday");

            NotepadAirlines notepadAirlines = new NotepadAirlines(airline, airline1, airline2, airline3);

            List<Airline> airlines = notepadAirlines.findAirlinesByDayOfWeek("wednesday");
            LocalTime localTime = LocalTime.parse("20:00");
            airlines = notepadAirlines.findAirlinesByDayOfWeekAndLaterSpecifiedTime(localTime, airlines);
            airlines = notepadAirlines.findAirlinesByDestination("moscow");
            airlines = notepadAirlines.findAirlinesByDayOfWeekAndLaterSpecifiedTime(localTime, "sunday");
            for (Airline air: airlines) {
                System.out.println(air.toString());
            }

        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
