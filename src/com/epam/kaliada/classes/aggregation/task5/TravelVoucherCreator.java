package com.epam.kaliada.classes.aggregation.task5;

public class TravelVoucherCreator {
    public static TravelVoucher createTravelVoucher(TypeOfTourEnum typeOfTour, TransportEnum transport, TypeOfFoodEnum typeOfFood, int duration){
        if (duration < 1){
            throw new IllegalArgumentException("You entered wrong duration");
        }
        return new TravelVoucher(typeOfTour, transport, typeOfFood, duration);
    }
}
