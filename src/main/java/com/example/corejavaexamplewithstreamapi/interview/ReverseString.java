package com.example.corejavaexamplewithstreamapi.interview;

public class ReverseString {

  public static String reverseString(String val) {
    final char[] chars = val.toCharArray();
    final StringBuilder builder = new StringBuilder();
    for (int i = chars.length - 1; i >= 0; i--) {
      builder.append(chars[i]);
    }
    return builder.toString();
  }
}

