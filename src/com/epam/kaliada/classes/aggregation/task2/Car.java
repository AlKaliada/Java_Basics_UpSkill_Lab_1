package com.epam.kaliada.classes.aggregation.task2;

public class Car {
    private final String brand;
    private Wheel wheel;
    private Engine engine;
    private int currentFuelVolume;
    private final int maxFuelVolume;
    private boolean engineRunning;

    public Car(String brand, Wheel wheel, Engine engine, int maxFuelVolume) {
        this.brand = brand;
        this.wheel = wheel;
        this.engine = engine;
        this.maxFuelVolume = maxFuelVolume;
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
        this.currentFuelVolume = currentFuelVolume;
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
        engineRunning = true;
    }
    public void changeWheel(Wheel wheel){
        this.wheel = wheel;
    }
    public void refuel(int fuel){
        currentFuelVolume = Math.max(currentFuelVolume + fuel, maxFuelVolume);
    }
}
