package com.company.designpatterns.state;

import lombok.Setter;

@Setter
public class Human {

    private Activity state;

    public void doSomething() {
        state.doSomething(this);
    }
}
