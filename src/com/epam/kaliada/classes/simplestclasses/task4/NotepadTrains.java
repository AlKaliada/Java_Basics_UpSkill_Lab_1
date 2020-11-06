package com.epam.kaliada.classes.simplestclasses.task4;


public class NotepadTrains {
    private Train[] trains;

    public NotepadTrains() {
        this.trains = new Train[5];
    }
    public void trainCreator(String destination, int trainNumber, String departureTime){
        if (!departureTime.matches("^(([0-1][0-9])|(2[0-3]))-(([0-5][0-9])|(6[1-9]))$")){
            System.out.println("You entered wrong time of departure");
        }
        Train train = new Train(destination, trainNumber, departureTime);
    }
}
