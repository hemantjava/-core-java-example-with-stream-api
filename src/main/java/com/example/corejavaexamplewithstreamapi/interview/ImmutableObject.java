package com.example.corejavaexamplewithstreamapi.interview;

import java.time.LocalDateTime;

public final class ImmutableObject {

  private final Integer id;
  private final String name;
  private final LocalDateTime dob;


  private ImmutableObject(Integer id, String name, LocalDateTime dob) {
    this.id = id;
    this.name = name;
    this.dob = dob;
  }

  public static ImmutableObject getImmutableObject(Integer id, String name, LocalDateTime dob) {
    return new ImmutableObject(id, name, dob);
  }

  public Integer getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public LocalDateTime getDob() {
    return this.dob;
  }

  public String toString() {
    return "ImmutableObject(id=" + this.getId() + ", name=" + this.getName() + ", dob=" + this
        .getDob() + ")";
  }
}
