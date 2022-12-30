package com.example.corejavaexamplewithstreamapi.stream.map;

import com.example.corejavaexamplewithstreamapi.interview.Employee;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class ExampleTest {

    @Test
    void main ( ) {
        Map<String, Integer> budget = new HashMap<>();
        budget.put("clothes", 120);
        budget.put("grocery", 150);
        budget.put("transportation", 100);
        budget.put("utility", 130);
        budget.put("rent", 1150);
        budget.put("miscellneous", 90);
        System.out.println("Initial: " + budget);
        Example.main(budget);

    }

    @Test
    void mapSort(){
        Map<Employee, Integer> map = new HashMap<>();
        map.put(new Employee(1,32,"male","hemant","sahu"),1);
        map.put(new Employee(2,32,"male","emant","sahu"),2);
        map.put(new Employee(3,32,"male","mant","sahu"),3);
        map.put(new Employee(4,32,"male","ant","sahu"),4);
        map.put(new Employee(5,32,"male","nt","sahu"),5);
        map.put(new Employee(6,32,"female","sarita","sahu"),6);
        map.put(new Employee(7,32,"female","arita","sahu"),7);
        System.out.println("Initial sort:");
        map.forEach((k,v)->
             System.out.println(k+"  "+v)
      );
        System.out.println("--------------------------------------");
        Example.mapSort(map);
    }

    @Test
    void numberOfCharCount(){
        final Map<Character, Integer> map = Example.numberOfCharCount("hemant kumar sahu");
        System.out.println(map);
    }

    @Test
    void numberOfCharCount1(){
        final Map<Character, Integer> map = Example.numberOfCharCount1("hemant kumar sahu");
        System.out.println(map);
    }
}