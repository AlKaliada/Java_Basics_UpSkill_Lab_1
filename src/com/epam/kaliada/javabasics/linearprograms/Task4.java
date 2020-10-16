package com.epam.kaliada.javabasics.linearprograms;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.
public class Task4 {
    public static double changePartsOfNumber(double number){
        String str = String.valueOf(number);
        char[] chars = str.toCharArray();
        char a = chars[0];
        chars[0] = chars[4];
        chars[4] = a;
        a = chars[1];
        chars[1] = chars[5];
        chars[5] = a;
        a = chars[2];
        chars[2] = chars[6];
        chars[6] = a;
        str = String.valueOf(chars);
        double resultNumber = Double.parseDouble(str);
        return resultNumber;
    }
}
