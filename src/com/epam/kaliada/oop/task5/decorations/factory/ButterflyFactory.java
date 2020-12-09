package com.epam.kaliada.oop.task5.decorations.factory;

import com.epam.kaliada.oop.task5.decorations.Butterfly;
import com.epam.kaliada.oop.task5.decorations.Decoration;

public class ButterflyFactory implements DecorationFactory{
    @Override
    public Decoration createDecoration(int quantity) {
        if (quantity > 0){
            return new Butterfly(quantity);
        }else {
            throw new IllegalArgumentException("quantity less zero");
        }

    }
}
