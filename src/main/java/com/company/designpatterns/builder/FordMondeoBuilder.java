package com.company.designpatterns.builder;

import com.company.designpatterns.builder.model.Transmission;

public class FordMondeoBuilder extends NewCarBuilder {

    @Override
    void buildBrand() {
        car.setBrand("Ford Mondeo");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(200);
    }
}
