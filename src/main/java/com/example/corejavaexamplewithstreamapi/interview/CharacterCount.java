package com.example.corejavaexamplewithstreamapi.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {

    //Program HackerEarth
    public static String charCount1 (String value) {
        StringBuilder stringBuilder = new StringBuilder();//mapToObj(IntFunction )
        final Map<Character, Long> collect = value.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((k, v) -> stringBuilder.append(k + v));
        System.out.println(collect);
        return stringBuilder.toString();
    }

    public static void charCount2 (String value) {
        final Map<Character, Integer> collect = value.chars().boxed().collect(
            Collectors.toMap(k-> (char) k.intValue(), v -> 1, Integer::sum,
                    LinkedHashMap::new));
        System.out.println(collect);
    }

    public static void charCount3 (String value) {
        final Map<Character, Integer> collect = new LinkedHashMap<>();
        for (char c :value.toCharArray()){
            collect.merge(c,1,Integer::sum);
        }

        System.out.println(collect);
    }

    public static void main(String[] args) {
        charCount2("SSSSTTUUEEP");
    }

}
