package com.example.corejavaexamplewithstreamapi.ds.seaching;

public class LinearSearch {

	//Linear search time complexity : O(n) and Iterative way
	public static int searchElement(int arr[], int element) {

		for (int i = 0; i < arr.length; i++) {

			if (element == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	 /* Recursive Method to search x in arr[l..r] */
   public static int recSearch(int arr[], int l, int r, int x)
    { 
         if (r < l) 
            return -1; 
         if (arr[l] == x) 
            return l; 
         if (arr[r] == x) 
            return r; 
         return recSearch(arr, l+1, r-1, x); 
    } 

}
