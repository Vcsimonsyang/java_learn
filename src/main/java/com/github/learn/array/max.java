package com.github.learn.array;

public class max {
    public static void main(String[] args) {
        int[] arr = {1, 7, 15, 20, 25, 12, 3, 13};
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }

        }
        System.out.println("max value: " + max);
        System.out.println("max index: " + index);
    }
}
