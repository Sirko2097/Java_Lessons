package com.company.designpatterns.interpreter;

public class PlusExpression implements Expression {

    private Expression left;
    private Expression right;

    public PlusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter() {
        return left.interpreter() + right.interpreter();
    }
}
