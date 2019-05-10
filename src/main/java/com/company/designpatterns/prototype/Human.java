package com.company.designpatterns.prototype;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Human implements Copyable {

    private int age;
    private String name;

    @Override
    public Object copy() {
        Human copy = new Human(age, name);
        return copy;
    }
}
