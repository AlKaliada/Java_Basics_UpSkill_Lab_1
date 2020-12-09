package com.epam.kaliada.oop.task5.decorations.factory;

import com.epam.kaliada.oop.task5.decorations.Decoration;
import com.epam.kaliada.oop.task5.decorations.Tape;

public class TapeFactory implements DecorationFactory{
    @Override
    public Decoration createDecoration(int quantity) {
        if (quantity > 0){
            return new Tape(quantity);
        }else {
            throw new IllegalArgumentException("quantity less zero");
        }

    }
}
