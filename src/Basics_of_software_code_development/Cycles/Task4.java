package Basics_of_software_code_development.Cycles;

import java.math.BigInteger;

// Составить программу нахождения произведения квадратов первых двухсот чисел
public class Task4 {
    public static BigInteger multiplicateSquareTwoHundredNumbers(){
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i < 201; i++) {
            BigInteger a = BigInteger.valueOf(i);
            result = result.multiply(a.multiply(a));
        }
        return result;
    }
}
