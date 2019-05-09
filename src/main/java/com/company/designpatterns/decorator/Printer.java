package com.company.designpatterns.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Printer implements Printable {

    private String value;

    @Override
    public void print() {
        System.out.print(value);
    }
}
