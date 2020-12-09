package com.epam.kaliada.oop.task5;

import com.epam.kaliada.oop.task5.decorations.*;
import com.epam.kaliada.oop.task5.decorations.factory.BerryFactory;
import com.epam.kaliada.oop.task5.decorations.factory.DecorationFactory;
import com.epam.kaliada.oop.task5.decorations.factory.TapeFactory;
import com.epam.kaliada.oop.task5.flowers.Flower;
import com.epam.kaliada.oop.task5.flowers.FlowerAction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleApplication {
    private List<Flower> flowers = new ArrayList<>();
    private Packaging packaging;
    private Decoration decorations;
    private final static String QUESTION_FLOWER = "Would you like more flowers?";
    private final static String YES = "yes";
    private final static String NO = "no";
    private final static String QUESTION_DECORATION = "Would you like decorations?";
    private String flowerResource = "src/com/epam/kaliada/oop/task5/resources/flowers.txt";

    public String getFlowerResource() {
        return flowerResource;
    }

    public void setFlowerResource(String flowerResource) {
        this.flowerResource = flowerResource;
    }

    public void startApplication() throws IOException{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            chooseFlower();
            System.out.println(QUESTION_FLOWER);
            String answer = reader.readLine();
            while (!answer.equalsIgnoreCase(NO)){
                if (answer.equalsIgnoreCase(YES)){
                    chooseFlower();
                }
                System.out.println(QUESTION_FLOWER);
                answer = reader.readLine();
            }
            packaging = choosePackaging();
            System.out.println(QUESTION_DECORATION);
            String answerDecor = reader.readLine();
            while (!answerDecor.equalsIgnoreCase(YES) && !answerDecor.equalsIgnoreCase(NO)){
                System.out.println("I didn't understand you");
                System.out.println(QUESTION_DECORATION);
                answerDecor = reader.readLine();
            }
            if (answerDecor.equalsIgnoreCase(YES)){
                chooseDecoration();
            }
            Composition composition = new Composition
                    .CompositionBuilder(flowers, packaging)
                    .setDecorations(decorations)
                    .build();
            System.out.println(composition.toString());
    }

    private void chooseFlower() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FlowerAction flowerAction = new FlowerAction(flowerResource);
        System.out.println("Which flowers would you like?");
        String flowerName = reader.readLine();
        while (!flowerAction.checkFlowers(flowerName)){
            System.out.println("we don't have " + flowerName + ". Try one more time");
            flowerName = reader.readLine();
        }
        String quantityFlowers;
        do {
            System.out.println("How many " + flowerName + " would you like?");
            quantityFlowers = reader.readLine();
        }while (!quantityFlowers.matches("\\d"));
        int count = Integer.parseInt(quantityFlowers);
        Flower flower = flowerAction.createFlower(flowerName, count);
        flowers.add(flower);
    }

    private Packaging choosePackaging() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Which packaging would you like?");
            String packagingName = reader.readLine();
            if (packagingName.equalsIgnoreCase("basket")){
                return Packaging.BASKET;
            }else if (packagingName.equalsIgnoreCase("paper")){
                return Packaging.PAPER;
            }else if (packagingName.equalsIgnoreCase("box")){
                return Packaging.BOX;
            }
            System.out.println("Sorry, we don't have " + packagingName);
            }
    }

    private void chooseDecoration() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DecorationFactory decorationFactory = createDecorationFactory();
        String quantityDecorations;
        do {
            System.out.println("How many decorations would you like?");
            quantityDecorations = reader.readLine();
        }while (!quantityDecorations.matches("\\d"));
        int quantity = Integer.parseInt(quantityDecorations);
        decorations = decorationFactory.createDecoration(quantity);
    }
    private DecorationFactory createDecorationFactory() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Which decoration would you like?");
            String decorationName = reader.readLine();
            switch (decorationName) {
                case ("Berry"):
                    return new BerryFactory();
                case ("Butterfly"):
                    return new BerryFactory();
                case ("Tape"):
                    return new TapeFactory();
                default:
                    System.out.println("W don't have " + decorationName);
            }
        }
    }
}
