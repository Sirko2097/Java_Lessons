package com.company.designpatterns.strategy;

import lombok.Setter;

@Setter
public class StrategyClient {

    private Sorting strategy;

    public void executeStrategy(int[] arr) {
        strategy.sort(arr);
    }
}
