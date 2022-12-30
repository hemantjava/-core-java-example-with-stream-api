package com.example.corejavaexamplewithstreamapi.objects;

public class Example {
   static int i;
  {
    i++;
  }
  Example(){}
  Example(int i){}
  Example(String s){}
  public static void main(String[] args) {
    new Example();
    new Example(1);
    new Example("s");
    System.out.println(i);
  }

}
