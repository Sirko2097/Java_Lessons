package com.company.designpatterns.flyweight;

public class Point implements Shape {

    @Override
    public void draw(int x, int y) {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}
