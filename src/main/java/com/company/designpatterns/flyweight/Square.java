package com.company.designpatterns.flyweight;

public class Square implements Shape {

    private int a = 10;

    @Override
    public void draw(int x, int y) {
        System.out.println("Start: (" + x + ", " + y + "); a = " + a);
    }
}
