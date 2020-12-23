package com.github.learn.week1.getIndex;

import java.util.Scanner;

public class getIndex {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == number ){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
