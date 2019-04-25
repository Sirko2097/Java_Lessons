package com.company.fourthtask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MainFourthTask {

    public static void main(String[] args) {
        int[] arr = {5, 4, 0, -2, 23, -233, 0, 233};


        IntStream stream = Arrays.stream(arr);
        System.out.println("Average: " + stream.average().getAsDouble());

        stream = Arrays.stream(arr);
        System.out.println("Min: " + stream.min().getAsInt());

        stream = Arrays.stream(arr);
        System.out.println("Elem == 0: " + stream.filter((n) -> n == 0).count());

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);

        stream = Arrays.stream(arr);
        System.out.println("Elem > 0: " + stream.filter((n) -> n > 0).count());

        stream = Arrays.stream(arr);
        arr = stream.map((n) -> (n * 3)).toArray();
        System.out.println("arr * 3: " + Arrays.toString(arr));

    }
}
