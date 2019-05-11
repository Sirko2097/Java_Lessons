package com.company.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed {

    private int temperature;

    private int pressure;

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(obs -> obs.handleEvent(temperature, pressure));
    }

    public void setMeasure(int t, int p) {
        temperature = t;
        pressure = p;
        notifyObserver();
    }
}
