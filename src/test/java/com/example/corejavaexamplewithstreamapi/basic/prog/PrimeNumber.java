package com.example.corejavaexamplewithstreamapi.basic.prog;

import java.util.stream.IntStream;

public class PrimeNumber {

  public static void main(String[] args) {
    for (int i = 0; i <= 10; i++) {
      if (isPrime(i)) {
        System.out.print(i+" ");
      }
    }
    System.out.println("\n-------------------");
    IntStream.rangeClosed(0,10).filter(PrimeNumber::isPrime).forEach(x-> System.out.print(x+" "));
  }

  private static boolean isPrime(int num) {
    boolean flag = true;
    if (num == 0 || num == 1) {
      return false;
    }

    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        flag = false;
        break;
      }
    }
    return flag;
  }

}
