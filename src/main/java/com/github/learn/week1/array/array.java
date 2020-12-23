package com.github.learn.week1.array;

public class array {
    public static void main(String[] args) {
//        array like {1,1,2,3,5,8...} get the 20th of this array;
        int[] number = new int[20];
        number[0] = 1;
        number[1] = 1;
        for (int i = 2; i < number.length; i++) {
            number[i] = number[i - 1] + number[i - 2];
        }
        System.out.println(number[19]);
    }
}
