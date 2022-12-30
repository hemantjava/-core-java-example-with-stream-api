package com.example.corejavaexamplewithstreamapi.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ObjectExample {
    public static void main(String[] args) {
        Map<String, List<Integer>> collect = IntStream.rangeClosed(1, 50).boxed().collect(Collectors.groupingByConcurrent(ObjectExample::apply));
        collect.forEach((k,v)->{
            System.out.println(k+" : "+v);
        });
        ConcurrentMap<String, Integer> collect1 = IntStream.rangeClosed(1, 50).boxed().collect(Collectors.groupingByConcurrent(i -> i % 2 == 0 ? "EVEN" : "ODD", Collectors.summingInt(Integer::intValue)));
        System.out.println("------------------------------------------------------------Find--------------");
        collect1.forEach((k,v)->{
            System.out.println(k+" : "+v);
        });
    }

    private static String apply(Integer i) {
        return i % 2 == 0 ? "EVEN" : "ODD";
    }
}
