package com.epam.kaliada.oop.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleApplicationStarter {
    public void startApplication() throws IOException{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Would your like to fill the treasury with treasures? Y/N?");
            String answer = reader.readLine();
            while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")){
                System.out.println("Try one more time. Y or N");
                answer = reader.readLine();
            }
            if (answer.equalsIgnoreCase("y")){
                ConsoleApplication consoleApplication = new ConsoleApplication();
                consoleApplication.startApplication();
            }
        }catch (IOException e){
            throw e;
        }
    }
}
