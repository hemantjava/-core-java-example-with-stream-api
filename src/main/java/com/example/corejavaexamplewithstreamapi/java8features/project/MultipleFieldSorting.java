package com.example.corejavaexamplewithstreamapi.java8features.project;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleFieldSorting {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, 23, "M", "Rick", "Hengis");
		Employee e2 = new Employee(2, 13, "F", "Rick", "Beethovan");
		Employee e3 = new Employee(3, 43, "M", "Ricky", "Martin");
		Employee e4 = new Employee(4, 26, "M", "Jon", "Lowman");
		Employee e5 = new Employee(5, 19, "F", "Cristine", "Maria");
		List<Employee> empList = Arrays.asList(e1, e2, e3, e4, e5);
		empList.forEach(x -> System.out.println(x));
		System.out.println("--------------------");
		List<Employee> empFName = empList.stream().sorted((x, y) -> x.getFirstName().compareTo(y.getFirstName()))
				.collect(Collectors.toList());
		empFName.forEach(x -> System.out.println(x));
		System.out.println("----------------------------");
		Comparator<Employee> com = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				int val = o1.getFirstName().compareTo(o2.getFirstName());
				if (o1.getFirstName().compareTo(o2.getFirstName()) == 0)
					return o1.getLastName().compareTo(o2.getLastName());
				return val;
			}

		};

		Comparator<Employee> com1 = (x, y) -> {
			if (x.getFirstName().compareTo(y.getFirstName()) == 0)
				return x.getLastName().compareTo(y.getLastName());
			return x.getFirstName().compareTo(y.getFirstName());

		};

		List<Employee> empFLName = empList.stream().sorted(com).collect(Collectors.toList());
		empFLName.forEach(x -> System.out.println(x));

		System.out.println("------------------------------------------------");

		List<Employee> empFLName1 = empList.stream().sorted(com1).collect(Collectors.toList());
		empFLName1.forEach(x -> System.out.println(x));

		System.out.println("------------------------------------------------");
		List<Employee> empFName2 = empList.stream().sorted((x, y) -> {
			if (x.getFirstName().compareTo(y.getFirstName()) == 0)
				return x.getLastName().compareTo(y.getLastName());
			return x.getFirstName().compareTo(y.getFirstName());
		}).collect(Collectors.toList());
		empFName2.forEach(x -> System.out.println(x));
		System.out.println("----------------------------");
	}

}
