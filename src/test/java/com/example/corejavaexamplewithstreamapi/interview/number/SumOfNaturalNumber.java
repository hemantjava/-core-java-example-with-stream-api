package com.example.corejavaexamplewithstreamapi.interview.number;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class SumOfNaturalNumber {

    @Test
    void sumOfNaturalNumber(){
        System.out.println(range(10));
    }


    private int range(int range){
        return IntStream.rangeClosed(1,range).sum();
    }
}
