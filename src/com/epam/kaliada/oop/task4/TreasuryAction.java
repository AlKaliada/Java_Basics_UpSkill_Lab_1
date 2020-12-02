package com.epam.kaliada.oop.task4;

import java.util.*;

public class TreasuryAction {
    public static void viewTreasures(List<Treasure> treasures){
        for (Treasure treasure : treasures) {
            System.out.println(treasure.toString());
        }
    }

    public static void viewTheMostExpensiveTreasure(List<Treasure> treasures){
        Collections.sort(treasures);
        System.out.println(treasures.get(treasures.size() - 1));
    }

    public static void viewTreasuresForGivenAmount(List<Treasure> treasures, double amount){
        List<Treasure> listResult = TreasuryAction.findTreasuresForGivenAmount(treasures, amount);
        for (Treasure treasure : listResult) {
            System.out.println(treasure.toString());
        }
    }
    private static List<Treasure> findTreasuresForGivenAmount(List<Treasure> treasures, double amount){
        List<Treasure> sample = new ArrayList<>();
        Collections.shuffle(treasures);
        boolean searchIsOver = false;
        while (!searchIsOver){
            searchIsOver = true;
            for (Treasure treasure : treasures) {
                if (amount - treasure.getValue() > 0){
                    sample.add(treasure);
                    amount -= treasure.getValue();
                    searchIsOver = false;
                }else if(amount - treasure.getValue() == 0){
                    sample.add(treasure);
                    searchIsOver = true;
                    break;
                }
            }
        }
        return sample;
    }
}
