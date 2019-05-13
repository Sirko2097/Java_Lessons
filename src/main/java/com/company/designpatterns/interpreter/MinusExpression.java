package com.company.designpatterns.interpreter;

public class MinusExpression implements Expression {

    private Expression left;
    private Expression right;

    public MinusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter() {
        return left.interpreter() - right.interpreter();
    }
}
