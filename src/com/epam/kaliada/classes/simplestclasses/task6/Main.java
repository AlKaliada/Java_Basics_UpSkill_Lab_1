package com.epam.kaliada.classes.simplestclasses.task6;
//Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения его
// отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений
// полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд.
public class Main {
    public static void main(String[] args) {
        TimeCreator timeCreator = new TimeCreator();
        Time time = timeCreator.createTime(100, 500, 901);

        timeCreator.changeTimeByHours(time, 10);
        timeCreator.changeTimeByMinutes(time, 100);
        timeCreator.changeTimeBySeconds(time, 10000);
        System.out.println(time.getHours() + " " + time.getMinutes() + " " + time.getSeconds());
    }
}
