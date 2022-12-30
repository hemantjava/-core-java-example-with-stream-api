package com.example.corejavaexamplewithstreamapi.java8features.project;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class EmployeePredicates {

	public static Predicate<Employee> isAdult() {
		//final boolean b = (Employee::getAge) >= 18;
		return employee -> employee.getAge()>=18;
	}

	public static Predicate<Employee> isMAdult() {
		return EmployeePredicates::test;
	}

	public static Predicate<Employee> isFAdult() {
		return EmployeePredicates::test2;
	}
	
	public static Predicate<Employee> isAgeGreater(Integer age) {
		return p -> p.getAge() > age;
	}
	
	//Operational methods
	
	public static List<Employee> getList(List<Employee> employees,Predicate<Employee> emPredicate) {
		return employees.stream().filter(emPredicate).collect(Collectors.toList());
	}

	private static boolean test (Employee emp) {
		return emp.getAge() >= 18 && emp.getGender().equalsIgnoreCase("M");
	}


	private static boolean test2 (Employee p) {
		return p.getAge() >= 18 && p.getGender().equalsIgnoreCase("F");
	}
}
