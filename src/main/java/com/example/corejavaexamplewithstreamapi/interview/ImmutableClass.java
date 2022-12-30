package com.example.corejavaexamplewithstreamapi.interview;

import java.util.Date;

public final class ImmutableClass {

  private Integer id;
  private String name;
  private Date dob;

  private ImmutableClass(Integer id, String name, Date dob) {
    this.id = id;
    this.name = name;
    this.dob = new Date();
  }

  public static ImmutableClass getImmutableClass(final Integer id, final String name,
      final Date dob) {

    return new ImmutableClass(id, name, dob);

  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Date getDob() {
    return dob;
  }

  @Override
  public String toString() {
    return "ImmutableClass{" +
        "id=" + this.getId() +
        ", name='" + this.getName() + '\'' +
        ", dob=" + this.getDob()+
        '}';
  }
}
