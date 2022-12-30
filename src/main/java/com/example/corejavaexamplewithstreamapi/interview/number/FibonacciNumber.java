package com.example.corejavaexamplewithstreamapi.interview.number;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(9));
    }
    private static int fibonacciNumber(int n){
        if (n<=1)
            return n;
            return fibonacciNumber(n-2)+fibonacciNumber(n-1);
    }
}
