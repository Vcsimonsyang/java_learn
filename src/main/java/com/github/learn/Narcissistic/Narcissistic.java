package com.github.learn.Narcissistic;

public class Narcissistic {
    public static void main(String[] args){
        System.out.println("Below is all the Narcissistic number that less than 1000");
        for(int i = 0; i <= 999; i++){
            int unit = i % 10;
            int tens = (i / 10) % 10;
            int thousands = (i / 100) % 10;
            if ( (unit * unit * unit + tens * tens * tens + thousands * thousands * thousands) == i){
                System.out.println(i);
            }
        }
    }
}
