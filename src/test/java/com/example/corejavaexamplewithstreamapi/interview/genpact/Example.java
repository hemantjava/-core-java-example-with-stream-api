package com.example.corejavaexamplewithstreamapi.interview.genpact;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

@Log4j2
public class Example {

    @Test
    void findNumberOfRepeated ( ) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 1, 3, 5, 6, 7);
        final Map<Integer, Long> collect = integers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        final long count = collect.values().stream().filter(x -> x >= 2).count();
        System.out.println(count);
    }
    @Test
    void findNumberOfRepeated1 ( ) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 1, 3, 5, 6, 7);
        final Map<Integer, Integer> collect = integers.stream()
                .collect(toMap(k->k,v->1,Integer::sum, LinkedHashMap::new));
        System.out.println(collect);
        final long count = collect.values().stream().filter(x -> x >= 2).count();
        System.out.println(count);
    }

    @Test
    void findCharsOfRepeated ( ) {
        String str = "Hemant kumar sahu";
        str = str.replaceAll("\\s", "");
        System.out.println(str);
        final Map<String, Long> collect = str.chars().mapToObj(ch -> Character.toString((char) ch))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }

    @Test
    void findCharsOfRepeated1 ( ) {

        String s = "hemant kumar sahu";
        s = s.replaceAll("\\s", "");
        final TreeMap<Character, Integer> collect = s.chars().boxed().collect(toMap(
                k -> Character.valueOf((char) k.intValue()),
                v -> 1,
                Integer::sum,
                TreeMap::new
        ));
        System.out.println(collect);
    }
}
