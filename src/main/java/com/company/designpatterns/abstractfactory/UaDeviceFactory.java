package com.company.designpatterns.abstractfactory;

import com.company.designpatterns.abstractfactory.impl.ua.UaKeyboard;
import com.company.designpatterns.abstractfactory.impl.ua.UaMouse;
import com.company.designpatterns.abstractfactory.impl.ua.UaTouchpad;
import com.company.designpatterns.abstractfactory.interfaces.DeviceFactory;
import com.company.designpatterns.abstractfactory.interfaces.Keyboard;
import com.company.designpatterns.abstractfactory.interfaces.Mouse;
import com.company.designpatterns.abstractfactory.interfaces.Touchpad;

public class UaDeviceFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new UaMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new UaKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new UaTouchpad();
    }
}
