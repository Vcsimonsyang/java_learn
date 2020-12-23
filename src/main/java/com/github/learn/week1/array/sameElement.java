package com.github.learn.week1.array;

public class sameElement {
    //    is there any same elements in two different array;
    public static void main(String[] args) {
        int[] arr1 = {1,3,6,77,888,234,5435,6436,7574567,56756,23,34,454,656};
        int[] arr2 = {2,3,5,6,88,23,342354,3453,2323,32,34,54,455,678,123,67,56756};
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
