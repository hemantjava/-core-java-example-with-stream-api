package com.example.corejavaexamplewithstreamapi.numbers;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		
		int[] num= {1,2,3,4,1,2,6,2};
		
		getDuplicateNumber(num);

	}
	
	private static void getDuplicateNumber(int nums[]) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int num:nums) {
			
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}else {
				map.put(num, 1);
			}
			
			
		}
		
		for(int num:map.keySet()) {
			
			if(map.get(num)>=2)
				System.out.println("Dublicate number:"+num);
			
			
		}
		
	}

}
