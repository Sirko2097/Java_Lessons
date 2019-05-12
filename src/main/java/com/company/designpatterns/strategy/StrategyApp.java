package com.company.designpatterns.strategy;

public class StrategyApp {

    public static void main(String[] args) {
        StrategyClient client = new StrategyClient();

        int[] arr = {1, 3, 2, -2};
        client.setStrategy(new SelectionSort());
        client.executeStrategy(arr);

        arr = new int[]{11, 4, 23, 2, -5, 0};
        client.setStrategy(new BubbleSort());
        client.executeStrategy(arr);

        arr = new int[]{3, -8, 2, 23, 0, 45};
        client.setStrategy(new InsertingSort());
        client.executeStrategy(arr);
    }
}
