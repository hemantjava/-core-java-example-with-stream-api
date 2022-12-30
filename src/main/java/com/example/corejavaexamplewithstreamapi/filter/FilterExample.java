package com.example.corejavaexamplewithstreamapi.filter;
import java.util.*;
import java.util.stream.Collectors;

public class FilterExample {

	public static void main(String[] args) {
		
		List<Emp> listImpl = Arrays.asList(new Emp(111, "hemant", "IT", 211324l, "bangalore"),
				new Emp(131, "hemant", "IT", 211324, "hyderabad"),
				new Emp(411, "hemant", "IT", 211324, "bangalore"),
				new Emp(151, "hemant", "IT", 211324, "pune"),
				new Emp(171, "hemant", "IT", 211324, "bangalore"),
				new Emp(611, "hemant", "IT", 211324, "pune"),
				new Emp(161, "hemant", "IT", 211324, "bangalore"),
				new Emp(181, "hemant", "IT", 211324, "hyderabad"),
				new Emp(191, "hemant", "IT", 211324, "bangalore"),
				new Emp(411, "hemant", "IT", 211324, "bangalore"),
				new Emp(511, "hemant", "IT", 211324, "hyderabad"),
				new Emp(811, "hemant", "IT", 211324, "bangalore"),
				new Emp(911, "hemant", "IT", 211324, "pune"),
				new Emp(112, "sarita", "CS", 211324, "bangalore"),
				new Emp(113, "hemant", "IT", 211324, "bangalore"),
				new Emp(119, "hemant", "IT", 211324, "hyderabad")
				);
		
		System.out.println("===========================================================");
		listImpl.forEach(System.out::println);
		System.out.println("==========================bangalore===========================");
		List<Emp> bangalorelistEmpl = listImpl.stream().filter(emp->emp.getCity().equals("bangalore")).collect(Collectors.toList());
		bangalorelistEmpl.forEach(System.out::println);
		System.out.println("===========================pune===========================");
		List<Emp> punelistEmpl = listImpl.stream().filter(emp->emp.getCity().equals("pune")).collect(Collectors.toList());
		punelistEmpl.forEach(System.out::println);
		System.out.println("==========================hyderabad===========================");
		List<Emp> hyderabadlistEmpl = listImpl.stream().filter(emp->emp.getCity().equals("hyderabad")).collect(Collectors.toList());
		hyderabadlistEmpl.forEach(System.out::println);
		System.out.println("==========================groupingBy===========================");
		final Map<String, List<Emp>> collect = listImpl.stream().collect(Collectors.groupingBy(Emp::getCity));
		for (Map.Entry<String, List<Emp>> entry : collect.entrySet()) {
			String key = entry.getKey();
			List<Emp> value = entry.getValue();
			System.out.println(key+"  "+value);
		}
		final Emp cs = listImpl.stream().filter(FilterExample::testDeptCS).collect(Collectors.toList()).get(0);
		System.out.println("===>"+cs);
		IntSummaryStatistics statistics = listImpl.stream().mapToInt(e -> e.getId()).summaryStatistics();
		System.out.println(statistics.getSum());
		System.out.println((int)Math.ceil(statistics.getAverage()));
		System.out.println(statistics.getMax());
		System.out.println(statistics.getMin());
		System.out.println(statistics.getCount());
	}


	private static boolean testDeptCS(Emp e) {
		return e.getDept().equalsIgnoreCase("CS");
	}
}
