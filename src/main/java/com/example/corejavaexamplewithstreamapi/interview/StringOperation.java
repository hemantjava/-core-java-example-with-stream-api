package com.example.corejavaexamplewithstreamapi.interview;

public class StringOperation {

  public static String reverseString(String val) {
    final char[] chars = val.toCharArray();
    final StringBuilder builder = new StringBuilder();
    for (int i = chars.length - 1; i >= 0; i--) {
      builder.append(chars[i]);
    }
    return builder.toString();
  }

  public static String reverseWord(String val){
    final String[] split = val.split(" ");
    final StringBuilder builder = new StringBuilder();
    for (int i = split.length-1; i >=0; i--) {
      builder.append(split[i]);
      builder.append(" ");
    }
    return builder.toString();
  }
}

