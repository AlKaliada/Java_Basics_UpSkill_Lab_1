package com.epam.kaliada.oop.task5;

import com.epam.kaliada.oop.task5.decorations.*;
import com.epam.kaliada.oop.task5.flowers.Flower;
import com.epam.kaliada.oop.task5.flowers.FlowersAction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleApplication {
    private List<Flower> flowers = new ArrayList<>();
    private Packaging packaging;
    private Decorations decorations;
    private final static String questionFlower = "Would you like more flowers?";
    private final static String yes = "yes";
    private final static String no = "no";
    private final static String questionDecoration = "Would you like decorations?";

    public void startApplication(){

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            chooseFlower();
            System.out.println(questionFlower);
            String answer = reader.readLine();
            while (!answer.equalsIgnoreCase(no)){
                if (answer.equalsIgnoreCase(yes)){
                    chooseFlower();
                }
                System.out.println(questionFlower);
                answer = reader.readLine();
            }
            packaging = choosePackaging();
            System.out.println(questionDecoration);
            String answerDecor = reader.readLine();
            while (!answerDecor.equalsIgnoreCase(yes) && !answerDecor.equalsIgnoreCase(no)){
                System.out.println("I didn't understand you");
                System.out.println(questionDecoration);
                answerDecor = reader.readLine();
            }
            if (answerDecor.equalsIgnoreCase(yes)){
                chooseDecoration();
            }
            Composition composition = new Composition
                    .CompositionBuilder(flowers, packaging)
                    .setDecorations(decorations)
                    .build();
            System.out.println(composition.toString());

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void chooseFlower(){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Which flowers would you like?");
            String flowerName = reader.readLine();
            while (!FlowersAction.checkFlowers(flowerName)){
                System.out.println("we don't have " + flowerName + ". Try one more time");
                flowerName = reader.readLine();
            }
            System.out.println("How much " + flowerName + " would you like?");
            int count = Integer.parseInt(reader.readLine());
            Flower flower = FlowersAction.createFlower(flowerName, count);
            flowers.add(flower);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private Packaging choosePackaging(){
        try {
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
        }catch (IOException e){
            e.printStackTrace();
        }
        throw new RuntimeException();
    }

    private void chooseDecoration(){
        decorations = new DefaultDecoration();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true){
                System.out.println("Which decoration would you like?");
                String decorationName = reader.readLine();
                switch (decorationName) {
                    case ("Berries"):
                        decorations = new Berries(decorations);
                        break;
                    case ("Butterflies"):
                        decorations = new Butterflies(decorations);
                        break;
                    case ("Tape"):
                        decorations = new Tape(decorations);
                        break;
                    default:
                        System.out.println("W don't have " + decorationName);
                }
                System.out.println("Would you like one more decoration");
                String answerDecor = reader.readLine();
                while (!answerDecor.equalsIgnoreCase(yes) && !answerDecor.equalsIgnoreCase(no)){
                    System.out.println("I didn't understand you");
                    System.out.println(questionDecoration);
                    answerDecor = reader.readLine();
                }
                if (answerDecor.equalsIgnoreCase(no)) {
                    break;
                }

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
