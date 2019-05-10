package com.company.designpatterns.builder;

import com.company.designpatterns.builder.model.Car;
import com.company.designpatterns.builder.model.Transmission;

public class BuilderApp {

    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildBrand("Audi")
                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(280)
                .build();
        System.out.println(car.toString());

        System.out.println(">>>>>>>>>>><<<<<<<<<<<");

        Director director = new Director();
        director.setCarBuilder(new SubaruBuilder());
        System.out.println(director.buildCar().toString());
        director.setCarBuilder(new FordMondeoBuilder());
        System.out.println(director.buildCar().toString());
    }
}
