package com.example.corejavaexamplewithstreamapi.java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Distinct {

	// removing duplicate values in the list
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

		// Removing duplicate values in the list
		List<String> list1 = list.stream().distinct().collect(Collectors.toList());
		// display 1st 6 elements in the list
		List<String> limit = list.stream().limit(6).collect(Collectors.toList());
		// skip 1st 4 elements in the list
		List<String> skip = list.stream().skip(4).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(list1);
		System.out.println(limit);
		System.out.println(skip);

		// Stream.iterate(initial,increments) -> Returns an infinite sequential ordered
		Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);

		List<Integer> newList = evenNumInfiniteStream.skip(5).limit(10).collect(Collectors.toList());
		System.out.println(newList);
	}

}
