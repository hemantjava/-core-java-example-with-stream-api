package com.example.corejavaexamplewithstreamapi.interview;

public class SecondHighest {

  public static int find2ndHighest(int[] arr) {
    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;

    if (arr.length < 2) {
      System.out.println("Invalid input..");
      System.exit(0);
    }

    for (int element : arr) {
      if (element > first) {
        second = first;
        first = element;
      }
    }
    System.out.println(first + "   " + second);
    return second;
  }
}


