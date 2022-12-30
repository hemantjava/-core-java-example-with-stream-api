package com.example.corejavaexamplewithstreamapi.designpattern.behavioral.strategy;

public class ColorMain {
    public static void main (String[] args) {
        ColorContext context = new ColorContext(new Yellow());
        context.executeStrategy();
        context = new ColorContext(new Green());
        context.executeStrategy();
        context = new ColorContext(new Red());
        context.executeStrategy();
    }
}
