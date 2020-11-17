package com.epam.kaliada.classes.aggregation.task5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TravelVoucher implements Comparable<TravelVoucher>{
    private static final double DEFAULT_PRICE_FOR_ONE_DAY = 24.04;
    private TypeOfTourEnum typeOfTour;
    private TransportEnum transport;
    private TypeOfFoodEnum typeOfFood;
    private int duration;
    private double price;

    public TravelVoucher(TypeOfTourEnum typeOfTour, TransportEnum transport, TypeOfFoodEnum typeOfFood, int duration) {
        this.typeOfTour = typeOfTour;
        this.transport = transport;
        this.typeOfFood = typeOfFood;
        this.duration = duration;
    }

    public static double getDefaultPriceForOneDay() {
        return DEFAULT_PRICE_FOR_ONE_DAY;
    }

    public TypeOfTourEnum getTypeOfTour() {
        return typeOfTour;
    }

    public TransportEnum getTransport() {
        return transport;
    }

    public TypeOfFoodEnum getTypeOfFood() {
        return typeOfFood;
    }

    public int getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }
    public void countPrice(){
        price = DEFAULT_PRICE_FOR_ONE_DAY * typeOfTour.getCoefficient() * transport.getCoefficient() * typeOfFood.getCoefficient() * duration;
        price = new BigDecimal(price).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String toString() {
        return "TravelVoucher{" +
                "typeOfTour=" + typeOfTour +
                ", transport=" + transport +
                ", typeOfFood=" + typeOfFood +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(TravelVoucher o) {
        return (int)(this.getPrice() - o.getPrice());
    }
}
