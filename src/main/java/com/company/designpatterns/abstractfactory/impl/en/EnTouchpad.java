package com.company.designpatterns.abstractfactory.impl.en;

import com.company.designpatterns.abstractfactory.interfaces.Touchpad;

public class EnTouchpad implements Touchpad {

    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        System.out.println("Moved for " + s + " pixels.");
    }
}
