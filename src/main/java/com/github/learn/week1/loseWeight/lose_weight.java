package com.github.learn.week1.loseWeight;

import java.util.Scanner;

public class lose_weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number 1 ~ 7");
        int date = sc.nextInt();
        if (date > 0 && date < 8) {
            if (date == 1) {
                System.out.println("running");
            } else if (date == 2) {
                System.out.println("swimming");
            } else if (date == 3) {
                System.out.println("walking");
            } else if (date == 4) {
                System.out.println("bicycle");
            } else if (date == 5) {
                System.out.println("boxing");
            } else if (date == 6) {
                System.out.println("climbing");
            } else {
                System.out.println("eating");
            }
        }

    }
}
