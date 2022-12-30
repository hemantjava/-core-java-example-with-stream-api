package com.example.corejavaexamplewithstreamapi.generics;

import java.util.List;

public class Employee {
	
	public <T> void print(List<T> tList) {
		for (T t : tList) {
			System.out.println(t);
		}
		
	}
	
	
	
}
