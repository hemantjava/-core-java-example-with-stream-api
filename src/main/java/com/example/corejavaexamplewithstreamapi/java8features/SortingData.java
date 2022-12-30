package com.example.corejavaexamplewithstreamapi.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingData {

	public static void main(String[] args) {
		
		 List<String> names1 = new ArrayList<String>();
	      names1.add("Mahesh ");
	      names1.add("Suresh ");
	      names1.add("Ramesh ");
	      names1.add("Naresh ");
	      names1.add("Kalpesh ");
	      System.out.println("Before:"+names1);
	      sort1(names1);
	      System.out.println("After:"+names1);
			
	      List<String> names2 = new ArrayList<String>();
	      names2.add("Mahesh ");
	      names2.add("Suresh ");
	      names2.add("Ramesh ");
	      names2.add("Naresh ");
	      names2.add("Kalpesh ");
	      

	      System.out.println("Before:"+names2);
	      sort2(names2);
	      System.out.println("After:"+names2);
	      
	      List<String> names3 = new ArrayList<String>();
	      names3.add("Mahesh ");
	      names3.add("Suresh ");
	      names3.add("Ramesh ");
	      names3.add("Naresh ");
	      names3.add("Kalpesh ");
	     

	      System.out.println("Before:"+names3);
	      //java8 by Stream API
	      List<String> names4 = names3.stream().sorted((x,y)->y.compareTo(x)).collect(Collectors.toList());
	      
	      System.out.println("After:"+names4);
	      

	}
	
	//Java7
	
	private static void sort1(List<String> nanes) {
		
		Collections.sort(nanes,new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				
				return arg1.compareTo(arg0);
			}});
		
	}
	
 //java8
	private static void sort2(List<String> nanes) {
		
		Collections.sort(nanes,(x,y)->y.compareTo(x));
		
	}
	

}
