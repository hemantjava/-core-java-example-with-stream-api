package com.example.corejavaexamplewithstreamapi.date;

import org.junit.jupiter.api.Test;

public class Example {

  @Test
  void test(){
               //yyyyMMdd
    String str = "20220111";
    StringBuffer sb = new StringBuffer();
    sb.append(str.substring(4,6));
    sb.append("/");
    sb.append(str.substring(6,8));
    sb.append("/");
    sb.append(str.substring(0,4));
    System.out.println(sb.toString());

  }

  @Test
  void substring(){
               //0123456789
    String str = "hemantsahu";
    System.out.println(str.substring(6));//starting index
    System.out.println(str.substring(0,6));
    System.out.println(str.substring(6)+str.substring(0,6));
  }

}
