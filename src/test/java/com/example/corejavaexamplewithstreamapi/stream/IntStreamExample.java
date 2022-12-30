package com.example.corejavaexamplewithstreamapi.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

public class IntStreamExample {

  @Test
  void  range() {
    final IntStream range = IntStream.range(0, 10);
    range.forEach(System.out::println);
  }

  @Test
  void rangeClosed() {
    final IntStream range = IntStream.rangeClosed(0, 10);
    final Stream<Integer> boxed = range.boxed(); //boxed()->covert IntStream to Stream<Integer>
    range.forEach(System.out::println);
  }

}
