package com.company.designpatterns.factory;

public class FactoryMethodApp {

    public static void main(String[] args) {
        WatchCreator creator = getWatchByName("Digital");
        Watch watch = creator.createWatch();
        watch.showTime();

        creator = getWatchByName("Rome");
        creator.createWatch().showTime();
    }

    private static WatchCreator getWatchByName(String name) {
        if (name.equals("Digital")) {
            return new DigitalWatchCreator();
        } else if (name.equals("Rome")) {
            return new RomeWatchCreator();
        }
        throw new RuntimeException("Not supported watch");
    }
}
