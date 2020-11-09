package com.epam.kaliada.classes.simplestclasses.task4;


import java.time.LocalTime;
import java.util.Arrays;

public class NotepadTrains {
    private Train[] trains;
    private int numberOfTrains;

    public NotepadTrains() {
        this.trains = new Train[5];
    }
    public void addTrain(String destination, int trainNumber, LocalTime departureTime){
        if (destination != null && trainNumber > 0 && numberOfTrains < trains.length){
            Train train = new Train(destination, trainNumber, departureTime);
            trains[numberOfTrains] = train;
            numberOfTrains++;
        }else{
            System.out.println("You entered wrong data or notepad of trains is full");
        }
    }

    public Train[] sortTrainsByNumber(){
        Train[] copy = trains.clone();
        int trains = 0;
        while (trains < copy.length && copy[trains] != null){
            trains++;
        }
        for (int i = 1; i < trains; i++) {
            int k = i;
            while (k > 0 && (copy[k].getTrainNumber() < copy[k - 1].getTrainNumber())){
                Train train = copy[k];
                copy[k] = copy[k - 1];
                copy[k - 1] = train;
                k --;
            }
        }
        return copy;
    }
    public Train findTrain(int numberOfTrain){
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].getTrainNumber() == numberOfTrain){
                return trains[i];
            }
        }
        throw new IllegalArgumentException("Train with number " + numberOfTrain + " not found");
    }
    public Train[] sortTrainsByDestination(){
        Train[] copy = trains.clone();

        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < (copy.length - 1); i++) {
                if (!checkTwoWordsSortedAlphabetically(copy[i].getDestination(), copy[i + 1].getDestination())){
                    sorted = false;
                    Train train = copy[i];
                    copy[i] = copy[i + 1];
                    copy[i + 1] = train;
                }
                if (copy[i].getDestination().equals(copy[i + 1].getDestination()) && copy[i].getDepartureTime().isAfter(copy[i + 1].getDepartureTime())){
                    sorted = false;
                    Train train = copy[i];
                    copy[i] = copy[i + 1];
                    copy[i + 1] = train;
                }
            }
        }
        return copy;
    }

    private boolean checkTwoWordsSortedAlphabetically(String first, String second){
        String[] strArray = {first.toLowerCase(), second.toLowerCase()};
        Arrays.sort(strArray);
        return first.toLowerCase().equals(strArray[0]);
    }
}
