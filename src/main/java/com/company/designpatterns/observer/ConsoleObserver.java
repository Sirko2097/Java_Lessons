package com.company.designpatterns.observer;

public class ConsoleObserver implements Observer {

    @Override
    public void handleEvent(int temp, int pressure) {
        System.out.println("Weather is changed. Temperature: " + temp + ", Pressure: " + pressure);
    }
}
