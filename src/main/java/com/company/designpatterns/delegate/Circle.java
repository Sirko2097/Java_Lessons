package com.company.designpatterns.delegate;

public class Circle implements Graphics {
    @Override
    public void draw() {
        System.out.println("Drawing circle...");
    }
}
