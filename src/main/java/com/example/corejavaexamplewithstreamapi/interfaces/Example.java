package com.example.corejavaexamplewithstreamapi.interfaces;


interface I1{
    default void display(){
        System.out.println("I1");
    }
}


interface I2{
    default void display(){
        System.out.println("I2");
    }
}
public class Example implements I1,I2 {

    @Override
    public void display() {
       I2.super.display();
    }

    public static void main(String[] args) {
        I1 i2 = new Example();
        i2.display();
    }
}
