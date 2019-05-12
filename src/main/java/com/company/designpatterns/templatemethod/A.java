package com.company.designpatterns.templatemethod;

public class A extends C {

    @Override
    public void differ() {
        System.out.print("2");
    }

    @Override
    public void anotherDiffer() {
        System.out.print("5");

    }
}
