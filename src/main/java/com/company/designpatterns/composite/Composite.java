package com.company.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape {

    private List<Shape> components = new ArrayList<>();

    public void addComponent(Shape component) {
        components.add(component);
    }

    public void removeComponent(Shape component) {
        components.remove(component);
    }

    @Override
    public void draw() {
        components.forEach(Shape::draw);
    }
}
