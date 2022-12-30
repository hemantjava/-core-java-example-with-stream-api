package com.example.corejavaexamplewithstreamapi.java8features;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
	public static void main(String[] args) {

		String anotherDate = "04 Apr 2016";
      //ofPattern
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy");
		LocalDate random = LocalDate.parse(anotherDate, df);

		System.out.println(anotherDate + " parses as " + random);
	}

}
