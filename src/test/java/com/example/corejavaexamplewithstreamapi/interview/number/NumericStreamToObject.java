package com.example.corejavaexamplewithstreamapi.interview.number;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.*;

public class NumericStreamToObject {

    @Test
    void convert() {
        List<Long> collect = LongStream.range(0, 10).boxed().collect(toList());
        List<Integer> collect1 = LongStream.range(0, 10).mapToObj(l -> (int) l).collect(toList());
        String str = "kjflkjdhlkfjhkljdlkfjkljd";
        Map<Character, Long> map = str.chars().mapToObj(i -> (char) i)
                .collect(groupingBy(Function.identity(), counting()));
        Map<Character, Integer> map1 = str.chars().boxed()
                .collect(toMap(k -> (char) k.intValue(),
                        v -> 1, Integer::sum));
        Map<Character, Integer> integerMap = str.chars().mapToObj(i -> (char) i)
                .collect(groupingBy(Function.identity(), collectingAndThen(counting(),
                        Long::intValue)));
        System.out.println(collect);
        System.out.println(collect1);
        map.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("=============================");
        map1.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("=============================");
        integerMap.forEach((k, v) -> System.out.println(k + " : " + v));
        
    }
}
