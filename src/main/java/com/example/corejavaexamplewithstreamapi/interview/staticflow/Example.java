package com.example.corejavaexamplewithstreamapi.interview.staticflow;

class A {

  static {
    System.out.println(1);
  }

  A() {
    System.out.println(2);
  }
}

class B extends A {

  static {
    System.out.println(3);
  }

  B() {
    System.out.println(4);
  }
}

public class Example {

  public static void main(String[] args) {
    B a = new B();
  }

}
