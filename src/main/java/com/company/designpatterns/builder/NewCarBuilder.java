package com.company.designpatterns.builder;

import com.company.designpatterns.builder.model.Car;
import lombok.Getter;

@Getter
public abstract class NewCarBuilder {
    protected Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildBrand();

    abstract void buildTransmission();

    abstract void buildMaxSpeed();


}
