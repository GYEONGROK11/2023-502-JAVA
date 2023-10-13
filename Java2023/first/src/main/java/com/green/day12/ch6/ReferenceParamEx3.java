package com.green.day12.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {

    public static void main(String[] args) {

        int[] arr = {3, 2, 6, 5, 4, 1, 7};
        System.out.println(Arrays.toString(arr));
        printArr(arr);
        sortArr(arr);
        printArr(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("sum = " + sumArr(arr));
    }

    public static void sortArr(int[] arr) { //오름차순
        for (int i = arr.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                int nIdx = j+ 1;
                if (arr[nIdx] < arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[nIdx];
                    arr[nIdx] = tmp;
                }
            }
        }
    }
    public static int sumArr(int[] arr){
        int sum=0;
        for (int val: arr) {
            sum+=val;
        } return sum;

    }
    public static void printArr(int[] arr){
        System.out.printf("[%d",arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", %d",arr[i]);
        }
        System.out.println("]");


    }
}
