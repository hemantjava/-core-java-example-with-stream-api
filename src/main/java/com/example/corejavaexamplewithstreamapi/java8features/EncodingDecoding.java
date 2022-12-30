package com.example.corejavaexamplewithstreamapi.java8features;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncodingDecoding {

	public static void main(String[] args) {

            Base64.Encoder encode = Base64.getEncoder();
            String pwd = "hemantsahu";
            String endoded = encode.encodeToString(pwd.getBytes(StandardCharsets.UTF_8));
            System.out.println(endoded);
            Base64.Decoder decode = Base64.getDecoder();
            byte[] bye = decode.decode(endoded);
           String  decoded = new String(bye);
           System.out.println(decoded);

	}

}
