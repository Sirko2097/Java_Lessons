package com.company.designpatterns.visitor;

public class VisitorApp {

    public static void main(String[] args) {
        Element car = new CarElement();
        car.accept(new BullyVisitor());
        System.out.println();
        car.accept(new MechanicVisitor());
    }
}
