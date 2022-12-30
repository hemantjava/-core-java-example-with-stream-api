package com.example.corejavaexamplewithstreamapi.interview;

import java.util.Arrays;

public class ShiftingZeroToEnd {

    public static void main (String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void pushZerosToEnd (int arr[]) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < n) {
            arr[count++] = 0;
        }
    }
}
