package com.company.designpatterns.decorator;


public class LeftBracketDecorator extends Decorator {

    public LeftBracketDecorator(Printable component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("[");
        super.print();
    }
}
