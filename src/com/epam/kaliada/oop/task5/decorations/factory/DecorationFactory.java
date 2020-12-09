package com.epam.kaliada.oop.task5.decorations.factory;

import com.epam.kaliada.oop.task5.decorations.Decoration;

public interface DecorationFactory {
    public Decoration createDecoration(int quantity);
}
