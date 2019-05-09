package com.company.designpatterns.abstractfactory.impl.ua;

import com.company.designpatterns.abstractfactory.interfaces.Touchpad;

public class UaTouchpad implements Touchpad {

    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        System.out.println("Змістилися на " + s + " пікселів.");
    }
}
