package com.company.designpatterns.decorator;

public class DecoratorApp {

    public static void main(String[] args) {
        Printable printer = new QuotesDecorator(new LeftBracketDecorator(
                new RightBracketDecorator(new Printer("Hello"))));
        printer.print();
    }
}
