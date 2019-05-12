package com.company.designpatterns.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlyweightApp {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        List<Shape> shapes = new ArrayList<>();

        shapes.add(factory.getShape("square"));
        shapes.add(factory.getShape("circle"));
        shapes.add(factory.getShape("circle"));
        shapes.add(factory.getShape("point"));
        shapes.add(factory.getShape("square"));
        shapes.add(factory.getShape("circle"));

        Random random = new Random();
        for (Shape shape : shapes) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            shape.draw(x, y);
        }
    }
}
