package com.company.designpatterns.observer;

public class ObserverApp {

    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();

        station.addObserver(new ConsoleObserver());
        station.addObserver(new FileObserver());

        station.setMeasure(25, 760);
    }
}
