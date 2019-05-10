package com.company.designpatterns.abstractfactory;

import com.company.designpatterns.abstractfactory.interfaces.DeviceFactory;
import com.company.designpatterns.abstractfactory.interfaces.Keyboard;
import com.company.designpatterns.abstractfactory.interfaces.Mouse;
import com.company.designpatterns.abstractfactory.interfaces.Touchpad;

public class AbstractFactoryApp {

    public static void main(String[] args) {
        DeviceFactory factory = getFactoryByCountryCode("UA");
        Mouse mouse = factory.getMouse();
        Keyboard keyboard = factory.getKeyboard();
        Touchpad touchpad = factory.getTouchpad();

        mouse.click();
        keyboard.printLine();
        touchpad.track(10, 20);

        factory = getFactoryByCountryCode("EN");
        factory.getMouse().click();
        factory.getKeyboard().printLine();
        factory.getTouchpad().track(20, 20);
    }

    private static DeviceFactory getFactoryByCountryCode(String code) {
        switch (code) {
            case "UA":
                return new UaDeviceFactory();
            case "EN":
                return new EnDeviceFactory();
            default:
                throw new RuntimeException("Unsupported country code " + code);
        }
    }
}
