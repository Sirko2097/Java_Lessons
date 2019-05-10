package com.company.designpatterns.builder;

import com.company.designpatterns.builder.model.Transmission;

public class SubaruBuilder extends NewCarBuilder {

    @Override
    void buildBrand() {
        car.setBrand("Subaru Impreza");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(280);
    }
}
