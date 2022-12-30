package com.example.corejavaexamplewithstreamapi.enums;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class WeekTest {

    @Test
    void read(){
        Week week = Week.FRI;
        System.out.println(week);
    }
    @Test
    void reads(){
        final Week[] values = Week.values();
        Arrays.stream(values).forEach(System.out::println);
    }

    @Test
    void readValue(){
        final Week[] values = Week.values();
        Arrays.stream(values).forEach(val->System.out.println(val.getValue()));
    }

    @Test
    void readOrdinal(){
        final Week[] values = Week.values();
        Arrays.stream(values).forEach(val->System.out.println(val.ordinal()));
    }

}