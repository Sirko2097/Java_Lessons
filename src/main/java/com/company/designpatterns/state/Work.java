package com.company.designpatterns.state;

public class Work implements Activity {

    @Override
    public void doSomething(Human context) {
        System.out.println("Working...");
        context.setState(new Weekend());
    }
}
