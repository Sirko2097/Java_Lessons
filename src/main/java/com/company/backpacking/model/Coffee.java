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
    private String condition;
    private Integer weight;
    private Double price;

    public Coffee(String name, String condition, Integer weight, Double price) {
        this.name = name;
        this.condition = condition;
        this.weight = weight;
        this.price = price;
    }
}
