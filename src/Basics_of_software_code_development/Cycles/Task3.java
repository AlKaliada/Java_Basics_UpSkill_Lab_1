package Basics_of_software_code_development.Cycles;
//Найти сумму квадратов первых ста чисел
public class Task3 {
    public static int sumSquareFistHundredNumbers(){
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += (i * i);
        }
        return sum;
    }
}
