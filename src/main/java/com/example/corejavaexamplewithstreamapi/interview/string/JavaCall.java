package com.example.corejavaexamplewithstreamapi.interview.string;

public class JavaCall {

    private  int num =5; //class variable
    private static void callByValue(int num){
        num =20; //local variable and stack memory | 2 stack memory
    }
    private static void callByReference(JavaCall javaCall){
        javaCall.num = 30; //heap memory | 2 reference object but address is same as
    }

    public static void main(String[] args) {
        final JavaCall javaCall = new JavaCall();
        System.out.println("Before Calling: "+javaCall.num);
        callByValue(javaCall.num);
        System.out.println("After Calling callByValue: "+javaCall.num);
        callByReference(javaCall);
        System.out.println("After Calling callByReference: "+javaCall.num);
    }
}
