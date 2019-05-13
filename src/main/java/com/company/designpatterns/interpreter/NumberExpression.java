package com.company.designpatterns.interpreter;

public class NumberExpression implements Expression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpreter() {
        return number;
    }
}
