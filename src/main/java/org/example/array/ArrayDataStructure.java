package org.example.array;

import java.util.HashSet;
import java.util.Set;

public class ArrayDataStructure {
    public static int findRepeating(int[] array, int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += array[i];
        }
        return sum - n * (n + 1) / 2;
    }

    public static int findOneMissing(int[] array, int n) {
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += array[i];
        }
        return n * (n + 1) / 2 - sum;
    }

    public static void printSubArraySumEqual(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            if (sum == k)
                System.out.println(arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    for (int l = i; l <= j; l++) {
                        System.out.print(arr[l] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void printPair(int[] input, int n) {
        if (input == null || input.length < 2) {
            return;
        }
        Set<Integer> set = new HashSet<>();
        for (int number : input) {
            int target = n - number;
            if (set.contains(target)) {
                System.out.printf("(%d,%d)\n", number, target);
            } else {
                set.add(number);
            }
        }
    }
}
