package com.company.designpatterns.visitor;

public class CarElement implements Element {

    private Element[] elements;

    public CarElement() {
        this.elements = new Element[]{
                new WheelElement("Front Left"),
                new WheelElement("Front Right"),
                new WheelElement("Rear Right"),
                new WheelElement("Rear Right"),
                new BodyElement(),
                new EngineElement()
        };
    }

    @Override
    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}
