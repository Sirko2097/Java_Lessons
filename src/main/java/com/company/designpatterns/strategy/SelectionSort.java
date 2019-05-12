package com.company.designpatterns.strategy;

import java.util.Arrays;

public class SelectionSort implements Sorting {

    @Override
    public void sort(int[] arr) {
        System.out.println("Selection sort");
        System.out.println("Before: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("After: " + Arrays.toString(arr));
    }
}
