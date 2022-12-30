package com.example.corejavaexamplewithstreamapi.designpattern.creational.singleton;

public class SingleObjectPattern {
    public static void main (String[] args) {
        final SingleObject object1 =  SingleObject.getSingleObject();
        final SingleObject object2 =  SingleObject.getSingleObject();

        System.out.println(object1.hashCode() +"=="+object2.hashCode());
    }
}
