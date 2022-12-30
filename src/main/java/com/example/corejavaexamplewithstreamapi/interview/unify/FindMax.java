package com.example.corejavaexamplewithstreamapi.interview.unify;

import java.util.List;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 4, 5, 6, 7, 8, 22, 9, 1);
        final int asInt = list.stream().mapToInt(Integer::valueOf).max().getAsInt();
        final Integer integer = list.stream().reduce(Integer::max).get();
        System.out.println(asInt);
        System.out.println(integer);

    }
}
