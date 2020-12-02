package com.epam.kaliada.oop.task4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Treasury {
    private List<Treasure> treasures;
    private String pathToTreasure;

    public Treasury(String pathToTreasure) {
        this.pathToTreasure = pathToTreasure;
        fillTheTreasury();
    }

    private void fillTheTreasury(){
        treasures = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToTreasure))){
            String line = reader.readLine();
            while (line != null){
                String[] strings = line.split("_");
                Treasure treasure = treasureCreator(strings);
                treasures.add(treasure);
                line = reader.readLine();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private Treasure treasureCreator(String[] line){
        switch (line[0]){
            case ("Gold"):
                return new Gold(line[1], Double.parseDouble(line[2]), line[3], Integer.parseInt(line[4]));
            case ("Gems"):
                return new Gems(line[1], Double.parseDouble(line[2]), line[3], GemsType.valueOf(line[4].replace(" ", "_").toUpperCase()), Integer.parseInt(line[5]));
            case ("Weapon"):
                return new Weapon(line[1], Double.parseDouble(line[2]), line[3], WeaponType.valueOf(line[4].replace(" ", "_").toUpperCase()));
            default:
                throw new IllegalArgumentException("no such type of treasure found");
        }
    }
}
