package com.example.corejavaexamplewithstreamapi.interview.string;

public class StringRotation {
    public static void main(String[] args) {

    String str = "hemant";
    System.out.println(str);

    System.out.println(rightrotate(str,2));

     System.out.println("===============================");
     System.out.println(leftrotate(str,2));
}

    public static String rightrotate(String input,int n){
        StringBuilder sb = new StringBuilder();
        int size = input.length();
        if(size<=n){

            return "invalid input";
        }

        sb.append(input.substring(n));
        sb.append(input.substring(0,n));
        return sb.toString();

    }
    public static String leftrotate(String input,int n){
        StringBuilder sb = new StringBuilder();
        int size = input.length();
        if(size<=n){

            return "invalid input";
        }
        sb.append(input.substring(input.length()-n));
        sb.append(input.substring(0,input.length()-n));
        return sb.toString();

    }

}
