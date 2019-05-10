package com.company.designpatterns.abstractfactory.impl.en;

import com.company.designpatterns.abstractfactory.interfaces.Keyboard;

public class EnKeyboard implements Keyboard {

    @Override
    public void print() {
        System.out.print("Print line");
    }

    @Override
    public void printLine() {
        System.out.println("Print line with moving to the next");
    }
}
