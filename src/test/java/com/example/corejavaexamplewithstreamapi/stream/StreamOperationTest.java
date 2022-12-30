package com.example.corejavaexamplewithstreamapi.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class StreamOperationTest {


  @Test
  void removeDuplicate() {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 5, 4, 3, 3, 1, 9);
    final Set<Integer> integerSet = StreamOperation.removeDuplicate(integers);
    System.out.println(integerSet);
  }

  @Test
  void removeDuplicateByDistinct() {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 5, 4, 3, 3, 1, 9);
    final List<Integer> integerSet = StreamOperation.removeDuplicateByDistinct(integers);
    System.out.println(integerSet);
  }



}
