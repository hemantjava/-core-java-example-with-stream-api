package com.example.corejavaexamplewithstreamapi.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamConversion {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9};
        final IntStream stream = Arrays.stream(num); //IntStream
        stream.forEach(System.out::println);
        final Stream<int[]> num1 = Stream.of(num);//Stream<int[]>

        int[] ints = stream.toArray();

    }
}
