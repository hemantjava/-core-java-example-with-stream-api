package com.example.corejavaexamplewithstreamapi.interview;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

class ImmutableObjectTest {

  private static void tryModification(Integer immutableField1, String immutableField2,
      LocalDateTime mutableField) {
    immutableField1 = 10000;
    immutableField2 = "test changed";
    mutableField.plusDays(10);
  }

  @Test
  void getImmutableObject() {
    final ImmutableObject immutableObject = ImmutableObject
        .getImmutableObject(1234, "sonu", LocalDateTime.now());
    System.out.println(immutableObject);
    tryModification(immutableObject.getId(), immutableObject.getName(), immutableObject.getDob());
    System.out.println(immutableObject);
  }
}