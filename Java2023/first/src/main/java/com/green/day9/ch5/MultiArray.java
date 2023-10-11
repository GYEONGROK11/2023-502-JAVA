package com.green.day9.ch5;

public class MultiArray {
    public static void main(String[] args) {  //다차원배열
        int[][] arr = {
                {100, 200},  //0번방
                {300, 400},  //1번방
                {500, 600},  //2번방
        };
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][0]);
        System.out.println("-------");
        int[] intArr = arr[2];
        System.out.println(intArr[0]);
        System.out.println("arr.lenght :" +arr.length);
        System.out.println("arr[0].lenght :" +arr[0].length);

        /*
        int[] Arr1 = arr[0];

        int[] newintarr = {1,2,3,4};
        arr[0] = newintarr;

        arr[0][0]=1000;

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        */


    }
}
