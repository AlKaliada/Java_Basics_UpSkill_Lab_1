package com.epam.kaliada.classes.aggregation.task5;

import java.util.ArrayList;
import java.util.List;

public class TravelVoucherPicker {
    public static List<TravelVoucher> pickTravelVoucher(int duration){
        List<TravelVoucher> vouchers = new ArrayList<>();
        TypeOfTourEnum[] typeOfTourEnum = TypeOfTourEnum.values();
        TransportEnum[] transportEnum = TransportEnum.values();
        TypeOfFoodEnum[] typeOfFoodEnum = TypeOfFoodEnum.values();
        for (int i = 0; i < typeOfTourEnum.length; i++) {
            for (int j = 0; j < transportEnum.length; j++) {
                for (int k = 0; k < typeOfFoodEnum.length; k++) {
                    TravelVoucher travelVoucher = TravelVoucherCreator.createTravelVoucher(typeOfTourEnum[i], transportEnum[j], typeOfFoodEnum[k], duration);
                    travelVoucher.countPrice();
                    vouchers.add(travelVoucher);
                }
            }
        }
        return vouchers;
    }
    public static List<TravelVoucher> pickTravelVoucher(int duration, TypeOfTourEnum typeOfTour){
        List<TravelVoucher> vouchers = new ArrayList<>();
        TransportEnum[] transportEnum = TransportEnum.values();
        TypeOfFoodEnum[] typeOfFoodEnum = TypeOfFoodEnum.values();
        for (int j = 0; j < transportEnum.length; j++) {
            for (int k = 0; k < typeOfFoodEnum.length; k++) {
                TravelVoucher travelVoucher = TravelVoucherCreator.createTravelVoucher(typeOfTour, transportEnum[j], typeOfFoodEnum[k], duration);
                travelVoucher.countPrice();
                vouchers.add(travelVoucher);
            }
        }
        return vouchers;
    }
    public static List<TravelVoucher> pickTravelVoucher(int duration, TransportEnum transport){
        List<TravelVoucher> vouchers = new ArrayList<>();
        TypeOfTourEnum[] typeOfTourEnum = TypeOfTourEnum.values();
        TypeOfFoodEnum[] typeOfFoodEnum = TypeOfFoodEnum.values();
        for (int j = 0; j < typeOfTourEnum.length; j++) {
            for (int k = 0; k < typeOfFoodEnum.length; k++) {
                TravelVoucher travelVoucher = TravelVoucherCreator.createTravelVoucher(typeOfTourEnum[j], transport, typeOfFoodEnum[k], duration);
                travelVoucher.countPrice();
                vouchers.add(travelVoucher);
            }
        }
        return vouchers;
    }
    public static List<TravelVoucher> pickTravelVoucher(int duration, TypeOfFoodEnum typeOfFood){
        List<TravelVoucher> vouchers = new ArrayList<>();
        TypeOfTourEnum[] typeOfTourEnum = TypeOfTourEnum.values();
        TransportEnum[] transportEnum = TransportEnum.values();
        for (int i = 0; i < typeOfTourEnum.length; i++) {
            for (int j = 0; j < transportEnum.length; j++) {
                TravelVoucher travelVoucher = TravelVoucherCreator.createTravelVoucher(typeOfTourEnum[i], transportEnum[j], typeOfFood, duration);
                travelVoucher.countPrice();
                vouchers.add(travelVoucher);
            }
        }
        return vouchers;
    }

    public static List<TravelVoucher> pickTravelVoucher(int duration, TypeOfTourEnum typeOfTour, TransportEnum transport){
        List<TravelVoucher> vouchers = new ArrayList<>();
        TypeOfFoodEnum[] typeOfFoodEnum = TypeOfFoodEnum.values();
        for (int i = 0; i < typeOfFoodEnum.length; i++) {
            TravelVoucher travelVoucher = TravelVoucherCreator.createTravelVoucher(typeOfTour, transport, typeOfFoodEnum[i], duration);
            travelVoucher.countPrice();
            vouchers.add(travelVoucher);
        }
        return vouchers;
    }

    public static List<TravelVoucher> pickTravelVoucher(int duration, TypeOfTourEnum typeOfTour, TypeOfFoodEnum typeOfFood){
        List<TravelVoucher> vouchers = new ArrayList<>();
        TransportEnum[] transportEnum = TransportEnum.values();
        for (int i = 0; i < transportEnum.length; i++) {
            TravelVoucher travelVoucher = TravelVoucherCreator.createTravelVoucher(typeOfTour, transportEnum[i], typeOfFood, duration);
            travelVoucher.countPrice();
            vouchers.add(travelVoucher);
        }
        return vouchers;
    }
    public static List<TravelVoucher> pickTravelVoucher(int duration, TransportEnum transport, TypeOfFoodEnum typeOfFood){
        List<TravelVoucher> vouchers = new ArrayList<>();
        TypeOfTourEnum[] typeOfTourEnum = TypeOfTourEnum.values();
        for (int i = 0; i < typeOfTourEnum.length; i++) {
            TravelVoucher travelVoucher = TravelVoucherCreator.createTravelVoucher(typeOfTourEnum[i], transport, typeOfFood, duration);
            travelVoucher.countPrice();
            vouchers.add(travelVoucher);
        }
        return vouchers;
    }
    public static TravelVoucher pickTravelVoucher(int duration, TypeOfTourEnum typeOfTour, TransportEnum transport, TypeOfFoodEnum typeOfFood){
        TravelVoucher travelVoucher = TravelVoucherCreator.createTravelVoucher(typeOfTour, transport, typeOfFood, duration);
        travelVoucher.countPrice();
        return travelVoucher;
    }

}
