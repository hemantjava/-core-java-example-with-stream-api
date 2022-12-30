package com.example.corejavaexamplewithstreamapi.interfaces;
interface Inter1{
    static void disp(){
        System.out.println("Inter1");
    }
}

interface Inter2{
    static void disp(){
        System.out.println("Inter2");
    }
}

public class Example2 implements Inter1,Inter2{
    public static void main(String[] args) {
        Inter1.disp();
        Inter2.disp();
    }
}
