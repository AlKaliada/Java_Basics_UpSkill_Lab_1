package com.epam.kaliada.classes.aggregation.task3;

import java.util.ArrayList;
import java.util.List;

//Создать объект класса Государство, используя классы Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
public class Main {
    public static void main(String[] args) {
        City minsk = new City("Minsk", 2_000_000, 2.5);
        City molodeczno = new City("Molodeczno", 87_000, 0.7);
        List<City> minskDistrictList = new ArrayList<>();
        minskDistrictList.add(minsk);
        minskDistrictList.add(molodeczno);
        District minskDistrict = new District("Minskiy", 3_500_000, minskDistrictList, minsk);

        City stolbcy = new City("Stolbcy", 80_000, 0.4);
        List<City> stolbcyDistrictList = new ArrayList<>();
        stolbcyDistrictList.add(stolbcy);
        District stolbcyDistrict = new District("Stolbcovskiy", 220_000, stolbcyDistrictList, stolbcy);

        List<District> minskRegionList = new ArrayList<>();
        minskRegionList.add(minskDistrict);
        minskRegionList.add(stolbcyDistrict);
        Region minskRegion = new Region("Minskaya", minskRegionList, minsk);

        List<Region> belarusList = new ArrayList<>();
        belarusList.add(minskRegion);
        Country belarus = new Country("Belarus", belarusList, minsk);

        System.out.println(belarus.getCapital().getName());
        System.out.println(belarus.getRegions().size());
        System.out.println(belarus.countSquare());
        for (int i = 0; i < belarus.getRegions().size(); i++) {
            System.out.println(belarus.getRegions().get(i).getCapital().getName());
        }

    }
}
