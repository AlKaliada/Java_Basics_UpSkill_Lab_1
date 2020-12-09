package com.epam.kaliada.oop.task5;

import java.io.IOException;

public class ConsoleApplicationStarter {
    public static void main(String[] args) {
        try {
            ConsoleApplication application = new ConsoleApplication();
            application.startApplication();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
