package com.company.designpatterns.state;

public class RadioHitFM implements Station {

    @Override
    public void play() {
        System.out.println("Radio Hit-FM...");
    }
}
