package com.github.learn.week1.loseWeight;

import java.util.Scanner;
public class lose_weight_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number 1 ~ 7");
        int date = sc.nextInt();
        if( date >= 1 && date <= 7){
            switch (date){
                case 1:
                    System.out.println("run");
                    break;
                case 2:
                    System.out.println("swim");
                    break;
                case 3:
                    System.out.println("walk");
                    break;
                case 4:
                    System.out.println("bicycle");
                    break;
                case 5:
                    System.out.println("boxing");
                    break;
                case 6:
                    System.out.println("climb");
                    break;
                case 7:
                    System.out.println("eat");
                    break;
            }
        }
    }
}
