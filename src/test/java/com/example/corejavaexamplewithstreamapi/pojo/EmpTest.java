package com.example.corejavaexamplewithstreamapi.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class EmpTest {

  @Test
  void testSingleValueAsList() {
    List<Emp> list = Arrays.asList(Emp.builder()
            .id(1)
            .name("A")
            .build(), Emp.builder()
            .id(2)
            .name("B")
            .build(),
        Emp.builder()
            .id(3)
            .name("C")
            .build(),
        Emp.builder()
            .id(4)
            .name("D")
            .build());
    final List<String> collect = list.stream().map(Emp::getName).collect(Collectors.toList());
    System.out.println(collect);
  }
}