package com.example.corejavaexamplewithstreamapi.numbers;

public class SecondLastNumber {

	public static void main(String[] args) {
		int[] arr = {18,6,3,4,66};
		System.out.println(getSecondndLargest(arr));

	}
  
	private static int getSecondndLargest(int[] unsortedArray) {
		 int firstLargest =Integer.MAX_VALUE;
		 int secondLargest =Integer.MAX_VALUE;
		 
		 if(unsortedArray.length<2) {
			 System.out.println("invalid input");
			 System.exit(0);
		 }
		
		 for(int current:unsortedArray) {
			 if(current<firstLargest) {
				 firstLargest = secondLargest;
				 secondLargest = current;
			 }else if(current<secondLargest && current != firstLargest) {
				 secondLargest = current;
			 }
			 
		 }
		 
		 return secondLargest;
	}
}
