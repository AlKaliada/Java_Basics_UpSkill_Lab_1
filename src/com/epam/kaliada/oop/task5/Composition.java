package com.epam.kaliada.oop.task5;

import com.epam.kaliada.oop.task5.decorations.Decorations;
import com.epam.kaliada.oop.task5.flowers.Flower;

import java.util.ArrayList;
import java.util.List;

public class Composition {

    private final Packaging packaging;
    private final Decorations decorations;
    private final List<Flower> flowers;
    private double price;

    public double getPrice() {
        return price;
    }

    public static class CompositionBuilder{
        private final List<Flower> flowers;
        private final Packaging packaging;


        private Decorations decorations;
        private double price;

        public CompositionBuilder(List<Flower> flowers, Packaging packaging) {
            this.flowers = flowers;
            this.packaging = packaging;
        }

        public CompositionBuilder setDecorations(Decorations decorations) {
            this.decorations = decorations;
            return this;
        }

        private CompositionBuilder cost(){
            double cost = 0.0;
            for (Flower flower : flowers) {
                cost += flower.cost();
            }
            if (decorations != null){
                price = cost + packaging.getPrice() + decorations.cost();
            }else {
                price = cost + packaging.getPrice();
            }

            return this;
        }
        public Composition build(){
            cost();
            return new Composition(this);
        }
    }
    private Composition(CompositionBuilder compositionBuilder){
        packaging = compositionBuilder.packaging;
        decorations = compositionBuilder.decorations;
        flowers = compositionBuilder.flowers;
        price = compositionBuilder.price;
    }

    @Override
    public String toString() {
        String result = "Your flower composition: ";
        for (Flower flower : flowers) {
            result += flower.toString();
        }
        result = result + "Packaging " + packaging.toString().toLowerCase() + ", ";
        if (decorations != null){
            result += decorations.toString();
        }
        result = result + " Price: " + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        if (obj == this) return true;
        Composition composition = (Composition) obj;
        if (!flowers.equals(composition.flowers)) return false;
        if (!packaging.equals(composition.packaging)) return false;
        if (price != composition.price) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) price;
        result = 31 * result + (packaging != null ? packaging.hashCode() : 0);
        result = 31 * result + (flowers != null ? flowers.hashCode() : 0);
        return result;
    }
}
