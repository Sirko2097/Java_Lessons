package com.company.designpatterns.delegate;

public class Triangle implements Graphics {
    @Override
    public void draw() {
        System.out.println("Drawing triangle...");
    }
}
