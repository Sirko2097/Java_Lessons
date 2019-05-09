package com.company.designpatterns.abstractfactory.interfaces;

public interface DeviceFactory {

    Mouse getMouse();

    Keyboard getKeyboard();

    Touchpad getTouchpad();
}
