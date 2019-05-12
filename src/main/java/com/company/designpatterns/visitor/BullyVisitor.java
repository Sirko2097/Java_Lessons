package com.company.designpatterns.visitor;

public class BullyVisitor implements Visitor {

    @Override
    public void visit(EngineElement engine) {
        System.out.println("Engine started.");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Hit body");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Spin helm");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Hit " + wheel.getName() + " wheel.");
    }
}
