package com.github.learn.week1.hens;

public class hens {
    public static void main(String[] args) {
//        slove the equation 5x + 3y + z/3 = 100; x + y + z = 100;
        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 30; y++) {
                int z = 100 - x - y;
                if (z % 3 == 0 && 5 * x + 3 * y + z / 3 == 100) {
                    System.out.println("x: " + x + " y: " + y + " z: " + z);
                }
            }
        }
    }
}
