package com.github.learn.function;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            int number = sc.nextInt();
            arr[i] = number;
        }
        int biggest = max(arr);
        System.out.println("max : " + biggest);
    }
    public static int max(int arr[]){
        int biggest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > biggest){
                biggest = arr[i];
            }
        }
        return biggest;
    }
}
