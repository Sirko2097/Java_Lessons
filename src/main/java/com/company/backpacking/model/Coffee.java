package com.company.backpacking.model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Coffee {

    private Integer id;
    private String name;
    private String condition;
    private Integer weight;
    private Double price;

    public Coffee(Integer id, String name, String condition, Integer weight, Double price) {
        this.id = id;
        this.name = name;
        this.condition = condition;
        this.weight = weight;
        this.price = price;
    }

    public Coffee(String name, String condition, Integer weight, Double price) {
        this.name = name;
        this.condition = condition;
        this.weight = weight;
        this.price = price;
    }
}
