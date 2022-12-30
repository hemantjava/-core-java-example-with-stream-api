package com.example.corejavaexamplewithstreamapi.java8features.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ForEachOrdered {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

		list.forEach(x -> {

			System.out.println(x + "   " + Thread.currentThread().getName());

		}); // 1

		System.out.println("----------------------------------");

		list.parallelStream().forEach(x -> {

			System.out.println(x + "   " + Thread.currentThread().getName());

		}); // 2

		System.out.println("---------------------------------");
		list.parallelStream().forEachOrdered(x -> {

			System.out.println(x + "   " + Thread.currentThread().getName());

		}); // 3
		
		List<Integer> listInt = Arrays.asList(6, 4, 7, 8, 10);
		 
		listInt.stream()
		        .sorted(Comparator.reverseOrder())
		        .forEachOrdered(System.out::println);
		
		// min and max value in the list
		System.out.println("min value:"+listInt.stream().min((x,y)->x-y).get());//Optional
		System.out.println("max value:"+listInt.stream().max((x,y)->x-y).get());//Optional

	}

}
