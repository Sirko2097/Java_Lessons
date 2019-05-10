package com.company.designpatterns.decorator;


public class RightBracketDecorator extends Decorator {

    public RightBracketDecorator(Printable component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("]");
    }
}
