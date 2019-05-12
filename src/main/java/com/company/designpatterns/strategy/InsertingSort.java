package com.company.designpatterns.strategy;

import java.util.Arrays;

public class InsertingSort implements Sorting {


    @Override
    public void sort(int[] arr) {
        System.out.println("Inserting sort");
        System.out.println("Before: " + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            while (i - 1 > 0 && arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
            }
        }

        System.out.println("After: " + Arrays.toString(arr));
    }
}
