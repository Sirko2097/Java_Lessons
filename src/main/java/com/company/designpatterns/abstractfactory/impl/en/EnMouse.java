package com.company.designpatterns.abstractfactory.impl.en;

import com.company.designpatterns.abstractfactory.interfaces.Mouse;

public class EnMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("Click");
    }

    @Override
    public void doubleClick() {
        System.out.println("Double click");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0) {
            System.out.println("Scroll Up");
        } else if (direction < 0) {
            System.out.println("Scroll down");
        } else {
            System.out.println("Staying");
        }
    }
}
