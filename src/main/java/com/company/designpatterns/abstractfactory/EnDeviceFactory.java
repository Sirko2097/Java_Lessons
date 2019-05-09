package com.company.designpatterns.abstractfactory;

import com.company.designpatterns.abstractfactory.impl.en.EnKeyboard;
import com.company.designpatterns.abstractfactory.impl.en.EnMouse;
import com.company.designpatterns.abstractfactory.impl.en.EnTouchpad;
import com.company.designpatterns.abstractfactory.interfaces.DeviceFactory;
import com.company.designpatterns.abstractfactory.interfaces.Keyboard;
import com.company.designpatterns.abstractfactory.interfaces.Mouse;
import com.company.designpatterns.abstractfactory.interfaces.Touchpad;

public class EnDeviceFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new EnTouchpad();
    }
}
