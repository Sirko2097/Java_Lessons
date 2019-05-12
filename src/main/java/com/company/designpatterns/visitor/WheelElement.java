package com.company.designpatterns.visitor;

import lombok.Getter;

@Getter
public class WheelElement implements Element {

    private String name;

    public WheelElement(String name) {
        this.name = name;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
