package com.example.corejavaexamplewithstreamapi.enums;

public enum Week {
    SUN(0),
    MON(1),
    TUE(2),
    WED(3),
    THI(4),
    FRI(5),
    SAT(6);

  private final int value;
   Week(int value){
      this.value = value;
  }
  public int getValue(){
      return value;
  }
}
