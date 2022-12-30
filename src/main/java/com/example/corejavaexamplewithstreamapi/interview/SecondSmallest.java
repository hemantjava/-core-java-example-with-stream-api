package com.example.corejavaexamplewithstreamapi.interview;

public class SecondSmallest {

  //unsorted arrays
  public static int find2ndSmallest(int[] arr) {
    int firstSmallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;

    if (arr.length < 2) {
      System.out.println("Invalid input..");
       System.exit(0);
    }

    for (int element : arr) {
      if (element < firstSmallest) {
        secondSmallest = firstSmallest;
        firstSmallest = element;
      }
    }
    System.out.println(firstSmallest+"====="+secondSmallest);
    return secondSmallest;

  }

}
