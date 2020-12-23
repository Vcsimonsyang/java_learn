package com.github.learn.function;

public class iterator {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        String result = run(arr);
        System.out.println(result);
    }

    public static String run(int[] a) {
        String result = "";
        for (int i = 0; i < a.length; i++) {
            result += a[i] + ",";
        }
        return result;
    }
}
