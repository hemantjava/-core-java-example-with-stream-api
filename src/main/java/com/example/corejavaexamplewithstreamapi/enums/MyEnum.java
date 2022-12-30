package com.example.corejavaexamplewithstreamapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class MyEnum {
    private PizzaStatus status;
    public enum PizzaStatus {
        ORDERED,
        READY,
        DELIVERED
    }

    @Getter
    @AllArgsConstructor
    public enum Status {
        ORDERED("sdg"),
        READY(""),
        DELIVERED("name");
        private String url;
    }

    public static void main (String[] args) {
        PizzaStatus[] values = PizzaStatus.values();
        for (PizzaStatus statuss : values) {
            System.out.println(statuss);
        }

        Status[] values1 = Status.values();
        System.out.println("----------------------------------------------");
        for (Status s : values1) {
            System.out.println(s.getUrl());
            System.out.println(s);
        }

    }
}
