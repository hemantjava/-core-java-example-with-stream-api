package com.example.corejavaexamplewithstreamapi.interview.unify;

public class CharCount {
    public static void main(String[] args) {
        String str ="AAABBFFT";
        int count =0;
        char ch = str.charAt(0);
        StringBuffer sb = new StringBuffer();
        for (int i=0;i< str.length();i++) {
            if (str.charAt(i) == ch) {
                count++;
                continue;
            }
               sb.append(ch);
               sb.append(count);
               count = 1;
               ch = str.charAt(i);

        }
        System.out.println(sb.toString());
    }
}
