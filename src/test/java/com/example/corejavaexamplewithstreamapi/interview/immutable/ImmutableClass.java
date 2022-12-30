package com.example.corejavaexamplewithstreamapi.interview.immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class ImmutableClass {

  private final Integer id;
  private final String name;
  private final Date bob;
  private final List<String> skills;
  private final Address address;

  public ImmutableClass(Integer id, String name, Date bob, List<String> skills,
      Address address) {
    this.id = id;
    this.name = name;
    this.bob = bob;
    this.skills = skills;
    this.address = address;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Date getBob() {
    return new Date(bob.getTime());
  }

  public List<String> getSkills() {
    return new ArrayList<>(skills);
  }

  public Address getAddress() {
    return Address.builder().city(address.getCity()).street(address.getStreet()).build();
  }

  @Override
  public String toString() {
    return "ImmutableClass{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", bob=" + bob +
        ", skills=" + skills +
        ", address=" + address +
        '}';
  }
}
