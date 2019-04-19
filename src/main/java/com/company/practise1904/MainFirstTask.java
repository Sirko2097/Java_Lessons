package com.company.practise1904;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MainFirstTask {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        int[] arr = {4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7};
        for (int value : arr) {
            list.add(value);
        }

        List<Integer> distinctIntegers = list.stream().distinct().sorted().collect(Collectors.toList());
        List<Long> amountOfElement = new ArrayList<>();

        distinctIntegers.forEach((n) -> amountOfElement.add(list.stream().filter(n::equals).count()));

        for (int i = 0; i < distinctIntegers.size(); i++) {
            System.out.println(distinctIntegers.get(i) + " - " + amountOfElement.get(i));
        }
    }
}
