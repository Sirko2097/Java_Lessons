package com.company.designpatterns.flyweight;

public class Circle implements Shape {

    private int radius;

    @Override
    public void draw(int x, int y) {
        System.out.println("Print circle with radius: " + radius + "center: ("
                + x + ", " + y + ")");
    }
}
