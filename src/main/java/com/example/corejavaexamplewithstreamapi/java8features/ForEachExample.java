package com.example.corejavaexamplewithstreamapi.java8features;

import java.util.HashMap;

public class ForEachExample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
	     
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		//Note reading elements in map (entrySet()/keySet()/values())
		
		map.entrySet().forEach(System.out::println);
		
		System.out.println("-----------OR-----------");
		map.entrySet().forEach((x)->{
		System.out.println(x.getKey()+"  "+x.getValue());
		}
				);
		
		System.out.println("-------------------------------");
		map.keySet().forEach(System.out::println);
		
		System.out.println("-----------OR-----------");
		map.keySet().forEach((x)->{
		System.out.println(x+"  "+map.get(x));
		}
				);

		System.out.println("============================");
		map.values().forEach(System.out::println);
		
		System.out.println("-----------direct------------");
		map.forEach((x,y)->{
			System.out.println(x+"  "+y);
		});
	}

}
