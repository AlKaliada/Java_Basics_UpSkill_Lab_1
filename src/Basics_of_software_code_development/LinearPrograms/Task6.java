package Basics_of_software_code_development.LinearPrograms;

public class Task6 {
    public static boolean isDotInSpace(int x, int y){
        if (y <= 0 && y >= -3 && x <= 4 && x >= -4){
            return true;
        }else if (y > 0 && y <= 4 && x <= 2 && x >= -2){
            return true;
        }else {
            return false;
        }
    }
}
