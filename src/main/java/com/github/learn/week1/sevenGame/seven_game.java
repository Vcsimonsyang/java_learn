package com.github.learn.week1.sevenGame;

public class seven_game {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i ++){
           int[] number =  position(i);
            int out1 = 0;
           for(int j = 0; j < number.length; j++){
               if(number[j] == 7){
                   out1 = i;
                   System.out.println(out1);
               }
           }
           if( i % 7 == 0 && i != out1){
               System.out.println(i);
           }
        }
    }
    public static int[] position(int a){
        int hundres = a / 100;
        int tens = a / 10 % 10;
        int unit = a % 10;
        return new int[] {hundres,tens,unit};
    }
}
