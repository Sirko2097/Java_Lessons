package com.company.designpatterns.templatemethod;

public abstract class C {

    public void templateMethod() {
        System.out.print("1");
        differ();
        System.out.print("3");
        anotherDiffer();
    }

    public abstract void differ();

    public abstract void anotherDiffer();
}
