package com.example.corejavaexamplewithstreamapi.interview;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class StringOperationTest {

  @Test
  void reverseString() {
    final String reverseString = StringOperation.reverseString("hemant kumar sahu");
    System.out.println(reverseString);
  }

  @Test
  void reverseWord() {
    final String reverseWord = StringOperation.reverseWord("hemant kumar sahu");
    System.out.println(reverseWord);
  }

  @Test
  void stringSplits() {
    String val = "hemantkumarsahu";
    final String[] split = val.split("/");
    System.out.println(split[0]);//hemantkumarsahu
  }
}