package com.epam.kaliada.classes.aggregation.task2;

public class Car {
    private static final int MIN_FUEL_VOLUME = 0;
    private final String brand;
    private Wheel wheel;
    private Engine engine;
    private int currentFuelVolume;
    private final int maxFuelVolume;
    private boolean engineRunning;


    public Car(String brand, Wheel wheel, Engine engine, int maxFuelVolume) {
        if (maxFuelVolume > 0){
            this.brand = brand;
            this.wheel = wheel;
            this.engine = engine;
            this.maxFuelVolume = maxFuelVolume;
        }else {
            throw new IllegalArgumentException("Not valid data");
        }

    }

    public String getBrand() {
        return brand;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getCurrentFuelVolume() {
        return currentFuelVolume;
    }

    public void setCurrentFuelVolume(int currentFuelVolume) {
        if (currentFuelVolume >= 0){
            this.currentFuelVolume = currentFuelVolume;
        }else {
            throw new IllegalArgumentException("Not valid data");
        }

    }

    public int getMaxFuelVolume() {
        return maxFuelVolume;
    }

    public void setEngineRunning(boolean engineRunning) {
        this.engineRunning = engineRunning;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }

    public void printBrand(){
        System.out.println(brand);
    }
    public void drive(){
        if (currentFuelVolume > MIN_FUEL_VOLUME){
            engineRunning = true;
        }else {
            System.out.println("Not enough fuel");
        }

    }
    public void changeWheel(Wheel wheel){
        this.wheel = wheel;
    }
    public void refuel(int fuel){
        if (fuel > 0){
            currentFuelVolume = Math.max(currentFuelVolume + fuel, maxFuelVolume);
        }else {
            throw new IllegalArgumentException("Not valid data");
        }

    }
}
