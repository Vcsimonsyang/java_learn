package com.github.learn.random;
import java.util.Scanner;
import java.util.Random;
public class numberGuess {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numberInput;
        System.out.println("please enter a integer less than 100 that you think is correct");
        Random ra = new Random();
        int numberRandom = ra.nextInt(100) + 1;
        do{
            numberInput = sc.nextInt();
            if(numberInput > numberRandom){
                System.out.println("Too big");
            }else if(numberInput < numberRandom){
                System.out.println("Too small");
            }else{
                System.out.println("bingo");
            }
        }while(numberInput != numberRandom);

    }
}