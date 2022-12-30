package com.example.corejavaexamplewithstreamapi.java8features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Convertion {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		// Convert Stream to List � Stream.collect( Collectors.toList() )
		List<Integer> list1 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(list1);
		// Convert Stream to array � Stream.toArray( EntryType[]::new )
		Integer[] ints = list.stream().filter(i -> i % 2 == 0).toArray(Integer[]::new);
		// System.out.println(ints.fo);
		for (Integer integer : ints) {
			System.out.print(integer + ", ");
		}

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		memberNames.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).sorted()
				.forEach(System.out::println);

		
		//Example of anyMatch() allMatch() nonMatch() all are returns boolean values
		boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

		matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

		matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

	}

}
