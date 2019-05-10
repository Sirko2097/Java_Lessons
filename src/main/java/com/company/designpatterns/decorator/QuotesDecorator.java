package com.company.designpatterns.decorator;


public class QuotesDecorator extends Decorator {

    public QuotesDecorator(Printable component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.println("\"");
    }
}
