package com.epam.kaliada.oop.task5.flowers;

import com.epam.kaliada.oop.task5.flowers.Flower;

import java.io.*;
import java.util.regex.Pattern;

public class FlowersAction {
    private static final String flowers = "src/com/epam/kaliada/oop/task5/resources/flowers.txt";

    public static Flower createFlower(String flowerName, int count){
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
    public static boolean checkFlowers(String flowerName){
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
            e.printStackTrace();
        }
        return false;
    }
    private static String findFlower(String flowerName){
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
            e.printStackTrace();
        }
        throw new IllegalArgumentException(flowerName + " flower not found");
    }

    private static String changeFlowersList(String name, int count){
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
            e.printStackTrace();
        }
        throw new RuntimeException("couldn't read the file");
    }
    private static void writeFlowersList(String flowersList){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(flowers))){
            writer.write(flowersList);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private static String changeLine(String line, int count){
        String[] lineArray = line.split(" ");
        lineArray[2] = String.valueOf(count);
        return lineArray[0] + " " + lineArray[1] + " " + lineArray[2];
    }
}
