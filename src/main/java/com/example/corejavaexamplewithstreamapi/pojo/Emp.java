package com.example.corejavaexamplewithstreamapi.pojo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Emp {
  private int id;
  private String name;
  private String adr;
  private int age;

}
