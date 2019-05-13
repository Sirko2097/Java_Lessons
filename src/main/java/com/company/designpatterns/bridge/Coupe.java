package com.company.designpatterns.bridge;

public class Coupe extends CarBase {

    public Coupe(Mark mark) {
        super(mark);
    }

    @Override
    void showType() {
        System.out.println("Coupe");
    }
}
