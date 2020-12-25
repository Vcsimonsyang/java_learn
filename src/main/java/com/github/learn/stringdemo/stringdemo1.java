package com.github.learn.stringdemo;

public class stringdemo1 {
    public static void main(String[] args) {
        String s = "hello";
        s = reverse(s);
        System.out.println(s);

    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
