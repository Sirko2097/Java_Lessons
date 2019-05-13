package com.company.designpatterns.bridge;

public class Hatchback extends CarBase {

    public Hatchback(Mark mark) {
        super(mark);
    }

    @Override
    void showType() {
        System.out.println("Hatchback");
    }


}
