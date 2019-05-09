package com.company.designpatterns.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Decorator implements Printable {

    private Printable component;

    @Override
    public void print() {
        component.print();
    }
}
