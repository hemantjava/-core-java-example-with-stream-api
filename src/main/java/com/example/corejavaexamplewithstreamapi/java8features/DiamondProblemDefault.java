package com.example.corejavaexamplewithstreamapi.java8features;

//case of default method
public class DiamondProblemDefault implements I1, I2 {

	public static void main(String[] args) {

		new DiamondProblemDefault().show();

	}

	@Override // if one interface implemented then overriding is optional. If two then should
				// be overridden as below and call specific one interface method i.e. I2.super.show();
	public void show() {
		I2.super.show();//optional
	}

}

interface I1 {
	default void show() {
		System.out.println("1st interface");
	}
}

interface I2 {
	default void show() {
		System.out.println("2nd interface");
	}
}