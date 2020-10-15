package Basics_of_software_code_development.Branching;
//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
public class Task3 {
    public static boolean isDotsOnOneStraight(int x1, int y1, int x2, int y2, int x3, int y3){
        if (((x1 - x2) * (y3 - y2)) == ((x3 - x2) * (y1 - y2))){
            return true;
        }else {
            return false;
        }
    }
}
