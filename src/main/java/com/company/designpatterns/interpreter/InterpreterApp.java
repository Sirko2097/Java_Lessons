package com.company.designpatterns.interpreter;

public class InterpreterApp {

    public static void main(String[] args) {
        Context context = new Context();
        Expression expression = context.evaluate("1-2+3");
        System.out.println(expression.interpreter());
    }
}
