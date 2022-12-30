package com.example.corejavaexamplewithstreamapi.ds.seaching;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 7, 11, 4};

        System.out.println(find(arr, 8));

    }

    private static int find(int[] arr, int search) {

        var size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == search)
                return i;
            else if (arr[size - i - 1] == search)
                return size - i - 1;
        }

        return -1;
    }
}