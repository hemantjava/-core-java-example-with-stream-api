package com.example.corejavaexamplewithstreamapi.Cloneing;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Address implements  Cloneable{
    private String city;
    private Integer zipCode;

    @Override
    protected Address clone ( ) throws CloneNotSupportedException {
        return this;
    }
}
