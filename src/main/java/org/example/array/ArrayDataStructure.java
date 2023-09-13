package org.example.array;

public class ArrayDataStructure {
    public static int findRepeating(int[] array, int n) {
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
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
}
