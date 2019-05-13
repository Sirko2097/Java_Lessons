package com.company.designpatterns.bridge;

public class Sedan extends CarBase {

    public Sedan(Mark mark) {
        super(mark);
    }

    @Override
    void showType() {
        System.out.println("Sedan");
    }
}
