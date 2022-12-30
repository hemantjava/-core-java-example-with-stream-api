package com.example.corejavaexamplewithstreamapi.designpattern.creational.adaptor;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DCImpl implements DC {

  public AC ac;

  @Override
  public Volt getVolt() {
    return Volt.builder().volt(ac.getVolt().getVolt()/3).build();
  }
}
