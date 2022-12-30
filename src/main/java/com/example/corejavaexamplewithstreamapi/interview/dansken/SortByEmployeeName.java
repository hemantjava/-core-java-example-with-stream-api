package com.example.corejavaexamplewithstreamapi.interview.dansken;

import com.example.corejavaexamplewithstreamapi.interview.Employee;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class SortByEmployeeName {
    public static void main (String[] args) {
        Map<Employee, Integer> map = new HashMap<>();
        map.put(new Employee(1, 32, "male", "hemant", "sahu"), 1);
        map.put(new Employee(2, 32, "male", "emant", "sahu"), 2);
        map.put(new Employee(3, 32, "male", "mant", "sahu"), 3);
        map.put(new Employee(4, 32, "male", "ant", "sahu"), 4);
        map.put(new Employee(5, 32, "male", "nt", "sahu"), 5);
        map.put(new Employee(6, 32, "female", "sarita", "sahu"), 6);
        map.put(new Employee(7, 32, "female", "arita", "sahu"), 7);
        System.out.println("-------------------Initial-----------------------------------");
        map.forEach((k, v) ->
            System.out.println(k + " " + v)
        );

        final LinkedHashMap<Employee, Integer> collect = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getFirstName)))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println("----------------sorted by key-------------------------");
        collect.forEach((k, v) ->
                System.out.println(k + "  " + v)
        );
    }
}
