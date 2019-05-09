package com.company.designpatterns.factory;

public class DigitalWatchCreator implements WatchCreator {

    @Override
    public Watch createWatch() {
        return new DigitaWatch();
    }
}
