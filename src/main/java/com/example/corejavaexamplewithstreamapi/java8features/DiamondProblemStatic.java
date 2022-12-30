package com.example.corejavaexamplewithstreamapi.java8features;

//case of static method can't be overridden
public class DiamondProblemStatic implements I3, I4 {

	public static void main(String[] args) {
		I3.show();
		

	}

	

	

}

interface I3 {
	static void show() {
		System.out.println("3st interface");
	}
}

interface I4 {
	static void show() {
		System.out.println("4nd interface");
	}
}