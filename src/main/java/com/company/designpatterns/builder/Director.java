package com.company.designpatterns.builder;

import com.company.designpatterns.builder.model.Car;
import lombok.Setter;

@Setter
public class Director {

    private NewCarBuilder carBuilder;

    Car buildCar() {
        carBuilder.createCar();
        carBuilder.buildBrand();
        carBuilder.buildTransmission();
        carBuilder.buildMaxSpeed();
        return carBuilder.getCar();
    }
}
