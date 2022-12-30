package com.example.corejavaexamplewithstreamapi.interview.string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringRotationTest {

  String str1 = "hemantsahu";
  @Test
  void leftrotate() {
    final String leftrotate = StringRotation.leftrotate(str1, 3);
    System.out.println(leftrotate);
  }

  @Test
  void rightrotate() {
    final String rightrotate = StringRotation.rightrotate(str1, 3);
    System.out.println(rightrotate);
  }
}