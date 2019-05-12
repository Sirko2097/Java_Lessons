package com.company.designpatterns.visitor;

public class MechanicVisitor implements Visitor {

    @Override
    public void visit(EngineElement engine) {
        System.out.println("Checked engine.");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Fixed body.");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Checked body.");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Pump up " + wheel.getName() + " wheel.");
    }
}
