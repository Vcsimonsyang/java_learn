package com.github.learn.week1.array;

public class array2 {
    //    array {68,27,95,88,171,996,51,210} if the elements' unit and tens are not 7
    //    and this element is a even number then summate them.
    public static void main(String[] args) {
        int[] arr = {68,27,95,88,171,996,51,210};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
          int[] number = position(arr[i]);
          if(number[0] != 7 && number[1] != 7 && arr[i] % 2 == 0){
              sum += arr[i];
          }
        }
        System.out.println(sum);
    }

    public static int[] position(int a) {
        int tens = a / 10 % 10;
        int unit = a % 10;
        return new int[]{tens, unit};
    }
}
