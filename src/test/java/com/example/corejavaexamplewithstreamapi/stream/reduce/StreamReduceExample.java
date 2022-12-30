package com.example.corejavaexamplewithstreamapi.stream.reduce;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

public class StreamReduceExample {

  @Test
  void sum(){
    Stream<Integer> integerStream = Stream.of(5,1,200);
    System.out.println(integerStream.reduce(0, Integer::sum));
    Random random = new Random();
    final IntStream ints = random.ints(3);
    ints.forEach(System.out::println);


  }

}
