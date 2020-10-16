package com.epam.kaliada.basics_of_software_code_development.linearPrograms;

public class Task6 {
    public static boolean isDotInSpace(int x, int y){
        boolean a = (y <= 0 && y >= -3 && x <= 4 && x >= -4);
        boolean b = (y > 0 && y <= 4 && x <= 2 && x >= -2);
        return a || b;
    }
}
