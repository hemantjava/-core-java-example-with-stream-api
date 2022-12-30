package com.example.corejavaexamplewithstreamapi.designpattern.creational.adaptor;

public class AdaptorExample {

  public static void main(String[] args) {
    AC ac = ()-> Volt.builder().volt(240).build();
    DC dc = new DCImpl(ac);
    System.out.println(dc.getVolt());
  }
}
