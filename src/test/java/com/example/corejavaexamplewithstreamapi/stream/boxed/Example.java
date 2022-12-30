package com.example.corejavaexamplewithstreamapi.stream.boxed;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

public class Example {

  @Test
  void testBoxed(){
    List<Integer> strings = Stream.of(1, 2, 4,5,6)
        .collect(Collectors.toList());

    //To convert a stream of primitives, we must first box the elements in their wrapper classes and then collect the wrapped objects in a collection.
    // This type of stream is called boxed stream.
    IntStream.of(1,2,3,4,5).boxed()
        .collect(Collectors.toList());
  }

}
