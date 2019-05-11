package com.company.designpatterns.observer;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileObserver implements Observer {

    @Override
    public void handleEvent(int temp, int pressure) {
        File file;
        try {
            file = File.createTempFile("TempPressure", "_txt");
            PrintWriter writer = new PrintWriter(file);
            writer.println("Weather is changed. Temperature: " + temp + ", Pressure: " + pressure);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
