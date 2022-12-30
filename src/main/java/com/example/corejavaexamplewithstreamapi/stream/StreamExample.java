package com.example.corejavaexamplewithstreamapi.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Mahesh ");
		names.add("Suresh ");
		names.add("Ramesh ");
		names.add("Nareh ");
		names.add("Kalpesh ");
		System.out.println("Without Sort:" + names);
		//System.out.println("Ascending:" + sortingAscendingByJava8(names));
		//System.out.println("Decending:" + sortingDecendingByJava8(names));
		sortingDecendingByJava8(names);
		//names.stream().filter(t->t.endsWith("esh ")).forEach(System.out::println);
		

	}

	private static List<String> sortingDecendingByJava8(List<String> names) {

		List<String> names1 = names.stream().peek(System.out::println).sorted((a,b)->b.compareTo(a))
				.collect(Collectors.toCollection(LinkedList::new));
		System.out.println(names1.getClass());
		return names1;
	}

	private static List<String> sortingAscendingByJava8(List<String> names) {
		List<String> names1 = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		return names1;

	}

}
