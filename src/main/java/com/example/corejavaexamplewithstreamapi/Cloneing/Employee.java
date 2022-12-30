package com.example.corejavaexamplewithstreamapi.Cloneing;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements Cloneable{
    private String name;
    private Integer id;
    private Address address;

    protected Employee clone ( ) throws CloneNotSupportedException {
        return this;
    }
}
