package com.epam.kaliada.oop.task5.flowers;

import com.epam.kaliada.oop.task5.flowers.Flower;

import java.io.*;
import java.util.regex.Pattern;

public class FlowerAction {
    private String flowers;

    public FlowerAction(String flowers) {
        this.flowers = flowers;
    }

    public String getFlowers() {
        return flowers;
    }

    public void setFlowers(String flowers) {
        this.flowers = flowers;
    }

    public Flower createFlower(String flowerName, int count) throws IOException{
        String flowerString = findFlower(flowerName);
        String[] flowerArray = flowerString.split(" ");
        int restOfFlowers = Integer.parseInt(flowerArray[2]) - count;
        if (restOfFlowers < 0){
            throw new IllegalArgumentException("We don't have " + count + " " + flowerName + ", available- " + Integer.parseInt(flowerArray[2]));
        }
        String newFlowersList = changeFlowersList(flowerString, restOfFlowers);
        writeFlowersList(newFlowersList.trim());

        return new Flower(flowerArray[0], Double.parseDouble(flowerArray[1]), count);
    }
    public boolean checkFlowers(String flowerName) throws IOException{
        try (BufferedReader reader = new BufferedReader(new FileReader(flowers))){
            String flowerString = reader.readLine();
            while (flowerString != null){
                if (Pattern.matches(flowerName + ".+", flowerString)){
                    return true;
                }else {
                    flowerString = reader.readLine();
                }
            }
        }catch (IOException e){
            throw e;
        }
        return false;
    }
    private String findFlower(String flowerName) throws IOException{
        try (BufferedReader reader = new BufferedReader(new FileReader(flowers))){
            String flowerString = reader.readLine();
            while (flowerString != null){
                if (Pattern.matches(flowerName + ".+", flowerString)){
                    return flowerString;
                }else {
                    flowerString = reader.readLine();
                }
            }
        }catch (IOException e){
            throw e;
        }
        throw new IllegalArgumentException(flowerName + " flower not found");
    }

    private String changeFlowersList(String name, int count) throws IOException{
        try (BufferedReader reader = new BufferedReader(new FileReader(flowers))){
            StringBuilder flowersList = new StringBuilder();
            String line = reader.readLine();
            while (line != null){
                if (line.equals(name)){
                    line = changeLine(line, count);
                }
                flowersList.append(line).append("\n");
                line = reader.readLine();
            }
            return flowersList.toString();
        }catch (IOException e){
            throw e;
        }
    }
    private void writeFlowersList(String flowersList) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(flowers))){
            writer.write(flowersList);
        }catch (IOException e){
            throw e;
        }
    }
    private String changeLine(String line, int count){
        String[] lineArray = line.split(" ");
        lineArray[2] = String.valueOf(count);
        return lineArray[0] + " " + lineArray[1] + " " + lineArray[2];
    }
}
