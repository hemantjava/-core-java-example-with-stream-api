package com.example.corejavaexamplewithstreamapi.interview.number;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class BinaryToDecimalTest {

  @Test
  void decimalToBinary() {
    final int binary = BinaryToDecimal.decimalToBinary(27);
    System.out.println(binary);
  }

  @Test
  void binaryToDecimal(){
    final int decimal = BinaryToDecimal.binaryToDecimal(11011);
    System.out.println(decimal);
  }
}