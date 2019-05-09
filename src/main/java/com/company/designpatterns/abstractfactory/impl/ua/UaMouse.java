package com.company.designpatterns.abstractfactory.impl.ua;

import com.company.designpatterns.abstractfactory.interfaces.Mouse;

public class UaMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Клік");
    }

    @Override
    public void doubleClick() {
        System.out.println("Подвійний клік");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0) {
            System.out.println("Скрол уверх");
        } else if (direction < 0) {
            System.out.println("Скрол вниз");
        } else {
            System.out.println("Стоїмо на місці");
        }
    }
}
