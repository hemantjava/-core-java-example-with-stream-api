package com.example.corejavaexamplewithstreamapi.interview.string;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CaesarCipherTest {

    @Test
    void encrypt ( ) {
        String pwd = "hemantz";
        final StringBuffer encrypt = CaesarCipher.encrypt(pwd, 1);
        final StringBuffer decrypt = CaesarCipher.decrypt(encrypt.toString(), 1);
        System.out.println("Initial: "+pwd);
        System.out.println("encrypt: "+encrypt);
        System.out.println("decrypt: "+decrypt);
    }

    @Disabled
    @Test
    void teats(){
        ((List<Integer>) new ArrayList<Integer>()).add(0);
        System.out.println(((List<Integer>) new ArrayList<Integer>()).get(0));
    }


}