package Basics_of_software_code_development.LinearPrograms;
//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.
public class Task4 {
    public static double changePartsOfNumber(double number){
        String str = "" + number;
        char[] chars = str.toCharArray();
        for (int i = 0; i < (chars.length / 2); i++) {
            char a = chars[i];
            chars[i] = chars[i + 4];
            chars[i + 4] = a;
        }
        str = "";
        for (int i = 0; i < chars.length; i++) {
            str +=chars[i];
        }
        double resultNumber = Double.parseDouble(str);
        return resultNumber;
    }
}
