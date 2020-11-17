package com.epam.kaliada.classes.aggregation.task5;

import java.util.Collections;
import java.util.List;

//Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта,
// питания и числа дней. Реализовать выбор и сортировку путевок.
public class Main {
    public static void main(String[] args) {
        List<TravelVoucher> vouchers = TravelVoucherPicker.pickTravelVoucher(365, TypeOfTourEnum.TREATMENT);
        Collections.sort(vouchers);
        vouchers.sort(new TransportComparator());
        for (TravelVoucher travelVoucher : vouchers) {
            System.out.println(travelVoucher.toString());
        }
    }
}
