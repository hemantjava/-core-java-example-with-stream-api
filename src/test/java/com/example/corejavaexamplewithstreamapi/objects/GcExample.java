package com.example.corejavaexamplewithstreamapi.objects;

import java.util.ArrayList;
import java.util.List;

public class GcExample {

  public static void main(String[] args) {
    List objs = new ArrayList();
    for (int i = 0; i < Integer.MAX_VALUE; i++) {
      //objs.add(new Object()); //StackFlowError
      new Object();
    }
  }
}
