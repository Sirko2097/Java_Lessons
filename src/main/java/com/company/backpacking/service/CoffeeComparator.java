package com.company.backpacking.service;

import com.company.backpacking.model.Coffee;

import java.util.Comparator;

public class CoffeeComparator implements Comparator<Coffee> {

    @Override
    public int compare(Coffee firstCoffee, Coffee secondCoffee) {
        return firstCoffee.getName().compareTo(secondCoffee.getName());
    }
}
