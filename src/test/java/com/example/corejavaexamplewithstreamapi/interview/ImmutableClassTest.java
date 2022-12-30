package com.example.corejavaexamplewithstreamapi.interview;

import java.util.Date;
import org.junit.jupiter.api.Test;

class ImmutableClassTest {

  private static void tryModification(Integer immutableField1, String immutableField2,
      Date mutableField) {
    immutableField1 = 10000;
    immutableField2 = "test changed";
    mutableField.setDate(10);
  }

  @Test
  void getImmutableClass() {
    final ImmutableClass immutableClass = ImmutableClass
        .getImmutableClass(111, "Hemant", new Date());
    System.out.println(immutableClass);
    tryModification(immutableClass.getId(), immutableClass.getName(), immutableClass.getDob());
    System.out.println(immutableClass);
  }
}