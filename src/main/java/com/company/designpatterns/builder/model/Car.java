package com.company.designpatterns.builder.model;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Car {
    private String brand;
    private Transmission transmission;
    private int maxSpeed;

}
