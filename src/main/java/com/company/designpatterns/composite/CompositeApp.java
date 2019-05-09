package com.company.designpatterns.composite;

public class CompositeApp {

    public static void main(String[] args) {
        Shape square = new Square();
        Shape squareOne = new Square();

        Shape triangle = new Triangle();

        Shape squareTwo = new Square();

        Shape circle = new Cirlce();
        Shape circleOne = new Cirlce();

        Composite composite  = new com.company.designpatterns.composite.Composite();
        Composite compositeOne  = new com.company.designpatterns.composite.Composite();
        Composite compositeTwo  = new com.company.designpatterns.composite.Composite();

        composite.addComponent(square);
        composite.addComponent(triangle);

        compositeOne.addComponent(squareOne);
        compositeOne.addComponent(circleOne);

        compositeTwo.addComponent(circle);
        compositeTwo.addComponent(squareTwo);

        composite.addComponent(compositeOne);
        composite.addComponent(compositeTwo);

        composite.draw();
    }
}
