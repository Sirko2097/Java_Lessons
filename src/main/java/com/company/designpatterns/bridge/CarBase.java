package com.company.designpatterns.bridge;

public abstract class CarBase {

    protected Mark mark;

    public CarBase(Mark mark) {
        this.mark = mark;
    }

    abstract void showType();

    void showDetails() {
        showType();
        mark.setMark();
    }
}
