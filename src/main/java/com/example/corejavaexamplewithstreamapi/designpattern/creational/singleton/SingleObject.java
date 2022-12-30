package com.example.corejavaexamplewithstreamapi.designpattern.creational.singleton;

public class SingleObject {
    private static SingleObject singleObject;

    private SingleObject ( ) {
    }

    public static SingleObject getSingleObject ( ) {
        if (singleObject == null) {
            singleObject = new SingleObject();
        }
        return singleObject;
    }
}
