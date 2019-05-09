package com.company.designpatterns.abstractfactory.impl.ua;

import com.company.designpatterns.abstractfactory.interfaces.Keyboard;

public class UaKeyboard implements Keyboard {

    @Override
    public void print() {
        System.out.print("Друкуємо рядок");
    }

    @Override
    public void printLine() {
        System.out.println("Друкуємо рядок з переходом на наступний");
    }
}
