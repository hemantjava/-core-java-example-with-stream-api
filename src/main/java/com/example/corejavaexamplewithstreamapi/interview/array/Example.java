package com.example.corejavaexamplewithstreamapi.interview.array;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {
        int[] ins = {1, 2, 3, 4, 5, 6, 8, 2, 3};

        Map<Integer, Long> map = Arrays.stream(ins).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((k, v) -> {
            if (v >= 2) {
                System.out.println("duplicate numbers: " + k);
            }
        });

        Optional<Integer> reduce = Arrays.stream(ins).boxed().reduce(Integer::max);
        reduce.ifPresentOrElse(System.out::println,()->System.out.println(0));
    }
}
