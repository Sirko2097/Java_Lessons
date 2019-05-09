package com.company.designpatterns.builder;

import com.company.designpatterns.builder.model.Car;
import com.company.designpatterns.builder.model.Transmission;

class CarBuilder {
    private String brand = "Default";
    private Transmission transmission = Transmission.MANUAL;
    private int maxSpeed = 120;

    CarBuilder buildBrand(String brand) {
        this.brand = brand;
        return this;
    }

    CarBuilder buildTransmission(Transmission t) {
        this.transmission = t;
        return this;
    }

    CarBuilder buildMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    Car build() {
        Car car = new Car();
        car.setBrand(brand);
        car.setTransmission(transmission);
        car.setMaxSpeed(maxSpeed);

        return car;
    }
}
