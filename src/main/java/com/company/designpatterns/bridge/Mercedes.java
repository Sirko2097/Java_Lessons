package com.company.designpatterns.bridge;

public class Mercedes implements Mark {

    @Override
    public void setMark() {
        System.out.println("Mercedes");
    }
}
