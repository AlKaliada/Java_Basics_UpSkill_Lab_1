package com.epam.kaliada.classes.simplestclasses.task4;

import java.time.LocalTime;


//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
// Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
// быть упорядочены по времени отправления.
public class Main {
    public static void main(String[] args) {
        try {
            NotepadTrains notepadTrains = new NotepadTrains();

            String time1 = "23:34";
            LocalTime localTime1 = LocalTime.parse(time1);
            notepadTrains.addTrain("Minsk",4,localTime1);

            String time2 = "15:10";
            LocalTime localTime2 = LocalTime.parse(time2);
            notepadTrains.addTrain("Hrodna", 2, localTime2);

            String time3 = "07:00";
            LocalTime localTime3 = LocalTime.parse(time3);
            notepadTrains.addTrain("Minsk",5, localTime3);

            String time4 = "20:02";
            LocalTime localTime4 = LocalTime.parse(time4);
            notepadTrains.addTrain("Vilnius",1, localTime4);

            String time5 = "06:37";
            LocalTime localTime5 = LocalTime.parse(time5);
            notepadTrains.addTrain("Moscow",3, localTime5);

            Train train = notepadTrains.findTrain(4);
            System.out.println(train.getDestination() + " " + train.getDepartureTime());

            Train[] sortedTrainsByNumber = notepadTrains.sortTrainsByNumber();
            for (int i = 0; i < sortedTrainsByNumber.length; i++) {
                System.out.println(sortedTrainsByNumber[i].getTrainNumber() + " " + sortedTrainsByNumber[i].getDestination() + " " + sortedTrainsByNumber[i].getDepartureTime());
            }

            System.out.println();

            Train[] sortedByDestination = notepadTrains.sortTrainsByDestination();
            for (int i = 0; i < sortedTrainsByNumber.length; i++) {
                System.out.println(sortedByDestination[i].getTrainNumber() + " " + sortedByDestination[i].getDestination() + " " + sortedByDestination[i].getDepartureTime());
            }
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
