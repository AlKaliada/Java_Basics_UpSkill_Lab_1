package com.epam.kaliada.classes.aggregation.task2;
//Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
// Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
public class Main {
    public static void main(String[] args) {
        Wheel wheel = new Wheel("Michelin", 19);
        Engine engine = new Engine("Benz", 700);
        Car car = new Car("Audi", wheel, engine, 40);
        car.refuel(20);
        car.drive();
    }
}
