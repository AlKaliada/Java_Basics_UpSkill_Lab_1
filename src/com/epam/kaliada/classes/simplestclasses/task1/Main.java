package com.epam.kaliada.classes.simplestclasses.task1;

public class Main {
    public static void main(String[] args) {
        Test1 test1 = new Test1(2, 3);
        test1.setA(5);
        ArithmeticActions arithmeticActions = new ArithmeticActions();
        int sum = arithmeticActions.sum(test1.getA(), test1.getB());
        int max = arithmeticActions.findMax(test1.getA(), test1.getB());
        ActionReport actionReport = new ActionReport();
        actionReport.printMax(test1.getA(), test1.getB(), max);
        actionReport.printSum(test1.getA(), test1.getB(), sum);
        actionReport.printVariables(test1.getA(), test1.getB());
    }
}
