package com.company.backpacking.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Coffee {

    private String name;
    private String weight;
    private Double price;

    public Coffee(String name, String weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
}
