package com.epam.kaliada.oop.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleApplication {
    private String menu = "Choose one of the options:\n" +
            "1.Look at all treasures;\n" +
            "2.Look at the most expensive treasure;\n" +
            "3.look at treasures for a given amount;\n" +
            "4.Leave the treasury.";
    public void startApplication() throws IOException{
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            Treasury treasury = new Treasury("src/com/epam/kaliada/oop/task4/resources/Treasure.txt");
            String choice = new String();
            do {
                System.out.println(menu);
                choice = reader.readLine();
                switch (choice){
                    case ("1"):
                        TreasuryAction.viewTreasures(treasury.getTreasures());
                        break;
                    case ("2"):
                        TreasuryAction.viewTheMostExpensiveTreasure(treasury.getTreasures());
                        break;
                    case ("3"):
                        System.out.println("Enter amount of treasure");
                        double amount = Double.parseDouble(reader.readLine());
                        TreasuryAction.viewTreasuresForGivenAmount(treasury.getTreasures(), amount);
                        break;
                    case ("4"):
                        break;
                    default:
                        System.out.println("Try one more time");
                }
            }
            while (!choice.equalsIgnoreCase("4"));

        }
    }
}
