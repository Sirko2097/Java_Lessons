package com.company.designpatterns.delegate;

public class Square implements Graphics {
    @Override
    public void draw() {
        System.out.println("Drawing square...");
    }
}
