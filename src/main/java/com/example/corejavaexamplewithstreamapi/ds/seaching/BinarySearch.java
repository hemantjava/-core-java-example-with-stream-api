package com.example.corejavaexamplewithstreamapi.ds.seaching;

//In BinarySearch array should be sorted arrays
//The time complexity of the binary search algorithm is O(log n).
// The best-case time complexity would be O(1)
public class BinarySearch {

	public static int binarySearch(int arr[], int elementToSearch) {

		int firstIndex = 0;
		int lastIndex = arr.length - 1;

		// termination condition (element isn't present)
		while (firstIndex <= lastIndex) {
			int middleIndex = (firstIndex + lastIndex) / 2;
			// if the middle element is our goal element, return its index
			if (arr[middleIndex] == elementToSearch) {
				return middleIndex;
			}

			// if the middle element is smaller
			// point our index to the middle+1, taking the first half out of consideration
			else if (arr[middleIndex] < elementToSearch) {
				firstIndex = middleIndex + 1;
			}

			// if the middle element is bigger
			// point our index to the middle-1, taking the second half out of consideration
			else {
				lastIndex = middleIndex - 1;
			}
		}
		return -1;
	}


	public static int recursiveBinarySearch(int arr[], int firstElement, int lastElement,
			int elementToSearch) {

		// termination condition
		if (lastElement >= firstElement) {
			int mid = (firstElement + lastElement ) / 2;

			// if the middle element is our goal element, return its index
			if (arr[mid] == elementToSearch) {
				return mid;
			}

			// if the middle element is bigger than the goal element
			// recursively call the method with narrowed data
			else if (arr[mid] > elementToSearch) {
				return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);
				// else, recursively call the method with narrowed data
			} else {
				return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
			}
		}

		return -1;
	}


}
