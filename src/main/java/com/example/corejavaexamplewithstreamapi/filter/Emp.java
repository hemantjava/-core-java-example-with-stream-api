package com.example.corejavaexamplewithstreamapi.filter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Emp {
	private int id;
	private String name;
	private String dept;
	private long salary;
	private String city;
}
