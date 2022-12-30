package com.example.corejavaexamplewithstreamapi.interview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

  @Test
  void reverseString() {
    final String reverseString = ReverseString.reverseString("hemnt kumar sahu");
    System.out.println(reverseString);
  }
}