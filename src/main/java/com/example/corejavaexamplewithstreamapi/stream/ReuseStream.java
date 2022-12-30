package com.example.corejavaexamplewithstreamapi.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReuseStream {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Mahesh", "Suresh", "Ramesh", "Nareh", "Kalpesh");
		names.forEach(System.out::println);
		Stream<String> s1 = names.stream();
		System.out.println(s1.filter(x -> x.equalsIgnoreCase("Mahesh")).findAny().get());
		//System.out.println(s1.filter(x -> x.equalsIgnoreCase("Ramesh")).findAny().get()); get NT exception
		Supplier<Stream<String>> s2 = ()-> names.stream();//wrap the stream in supplier 
		 //getting stream from supplier by get() of supplier like "s2.get()"
		System.out.println(s2.get().filter(x -> x.equalsIgnoreCase("Mahesh")).findAny().get());
		System.out.println(s2.get().filter(x -> x.equalsIgnoreCase("Nareh")).findAny().get());
		System.out.println(s2.get().filter(x -> x.equalsIgnoreCase("Kalpesh")).findAny().get());
	}

}
