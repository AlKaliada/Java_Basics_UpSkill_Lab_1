package com.epam.kaliada.oop.task5.decorations;

public abstract class Decoration {
   public abstract double cost();
   @Override
   public String toString() {
      return "Decoration: ";
   }
}
