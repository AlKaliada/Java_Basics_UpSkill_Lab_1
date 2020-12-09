package com.epam.kaliada.oop.task5.decorations.factory;

import com.epam.kaliada.oop.task5.decorations.Decoration;
import com.epam.kaliada.oop.task5.decorations.Tape;

public class TapeFactory implements DecorationFactory{
    @Override
    public Decoration createDecoration(int quantity) {
        return new Tape(quantity);
    }
}
