package com.epam.kaliada.oop.task5.decorations.factory;

import com.epam.kaliada.oop.task5.decorations.Berry;
import com.epam.kaliada.oop.task5.decorations.Decoration;

public class BerryFactory implements DecorationFactory{
    @Override
    public Decoration createDecoration(int quantity) {
        if (quantity > 0){
            return new Berry(quantity);
        }else {
            throw new IllegalArgumentException("quantity less zero");
        }

    }
}
