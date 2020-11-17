package com.epam.kaliada.classes.aggregation.task5;

import java.util.Comparator;

public class TypeOfFoodComparator implements Comparator<TravelVoucher> {
    @Override
    public int compare(TravelVoucher o1, TravelVoucher o2) {
        return o1.getTypeOfFood().toString().compareTo(o2.getTypeOfFood().toString());
    }
}
