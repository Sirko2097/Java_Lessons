package com.company.designpatterns.factory;

import java.time.LocalTime;

public class DigitaWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println(LocalTime.now());
    }
}
