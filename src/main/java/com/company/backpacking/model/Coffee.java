package com.company.backpacking.model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Coffee implements Comparable<Coffee>{

    private Integer id;
    private String name;
    private String condition;
    private Integer weight;
    private Integer price;

    public Coffee(Integer id, String name, String condition, Integer weight, Integer price) {
        this.id = id;
        this.name = name;
        this.condition = condition;
        this.weight = weight;
        this.price = price;
    }

    public Coffee(String name, String condition, Integer weight, Integer price) {
        this.name = name;
        this.condition = condition;
        this.weight = weight;
        this.price = price;
    }


    @Override
    public int compareTo(Coffee coffee) {
        return (Integer.compare(this.getPrice() / this.getWeight(), coffee.getPrice() / coffee.getWeight()));
    }
}
