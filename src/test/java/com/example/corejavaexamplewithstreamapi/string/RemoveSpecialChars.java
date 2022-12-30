package com.example.corejavaexamplewithstreamapi.string;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class RemoveSpecialChars {


  //Included "-" (hyphen)
  @Test
  void RemoveSpecialChars(){
    String val = "heman4 kiu sdkf kjfh 234 fkjg-iuy 76 ?";
    final String replaceAll = val.replaceAll("[^a-zA-z-]", " ").replaceAll("\\s+"," ");
    System.out.println(replaceAll);
    final String[] strings = replaceAll.split(" ");
    System.out.println(Arrays.toString(strings));
    System.out.println(strings.length);
  }

}
