package com.example.corejavaexamplewithstreamapi.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
map = transformation
flatmap = map + flatting allows array of arrays,collection of collections and streams of streams
 */
public class FlatMapExample {
    public static void main(String[] args) {
        String[][] str = {{"a"}, {"b", "c"}};
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1, 2, 3));
        list.add(List.of(11, 12, 13));
        list.add(List.of(21, 22, 23));
        Stream<Stream<Integer>> sm = Stream.of(Stream.of(1,2),Stream.of(4,5));

        String[] res = Arrays.stream(str).flatMap(Arrays::stream).toArray(String[]::new);
        System.out.println(Arrays.toString(res));


        List<Integer> ll = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(ll);

        List<Integer> collect = sm.flatMap(integerStream -> integerStream).collect(Collectors.toList());
        System.out.println(collect);
    }
}
