package com.example.corejavaexamplewithstreamapi.tess;

public class Main {
    public static void main(String[] args) {
        DAY[] values = DAY.values();
        for (DAY value : values) {
            System.out.println(value);
        }
        String name = DAY.MOD.name();
        System.out.println(name);
    }
}
