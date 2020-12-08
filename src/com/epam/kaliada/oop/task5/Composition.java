package com.epam.kaliada.oop.task5;

import com.epam.kaliada.oop.task5.decorations.Decorations;
import com.epam.kaliada.oop.task5.flowers.Flower;

import java.util.List;

public class Composition {

    private Packaging packaging;
    private Decorations decorations;
    private List<Flower> flowers;
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

        private void cost(){
            double cost = 0.0;
            for (Flower flower : flowers) {
                cost += flower.cost();
            }
            if (decorations != null){
                price = cost + packaging.getPrice() + decorations.cost();
            }else {
                price = cost + packaging.getPrice();
            }
        }
        public Composition build(){
            cost();
            Composition composition = new Composition();
            composition.packaging = packaging;
            composition.decorations = decorations;
            composition.flowers = flowers;
            composition.price = price;
            return composition;
        }
    }
    private Composition(){
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
        return decorations != null ? decorations.equals(composition.decorations) : composition.decorations == null;
    }

    @Override
    public int hashCode() {
        int result = (int) price;
        result = 31 * result + (packaging != null ? packaging.hashCode() : 0);
        result = 31 * result + (flowers != null ? flowers.hashCode() : 0);
        result = 31 * result + (decorations != null ? decorations.hashCode() : 0);
        return result;
    }
}
