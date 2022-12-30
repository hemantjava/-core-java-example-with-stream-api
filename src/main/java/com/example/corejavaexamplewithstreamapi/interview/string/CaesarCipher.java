package com.example.corejavaexamplewithstreamapi.interview.string;

//A Java Program to illustrate Caesar Cipher Technique
public class CaesarCipher {
    // Encrypts text using a shift od s
    public static StringBuffer encrypt (String text, int s) {
        StringBuffer result = new StringBuffer();

        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                char ch = (char) (( c +
                        s - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) ((c +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }


    public static StringBuffer decrypt (String text, int s) {
        StringBuffer result = new StringBuffer();

        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                char ch = (char) ((c -
                        s + 65) % 26 + 65);
                result.append(ch);
            } else {
                final int i = c - 32;
                char ch = (char) ((i -
                    s + 65) % 26 + 65);
                result.append((char)(ch+32));
            }
        }
        return result;
    }


}
