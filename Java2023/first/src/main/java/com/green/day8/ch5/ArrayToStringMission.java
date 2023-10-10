package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMission {
    public static void main(String[] args) {
        int[] arr = {5, 10, 7, 3, 11, 100};
        System.out.println(Arrays.toString(arr));
        //for문 으로 콘솔에 [5, 10, 7, 3] 출력되도록

        int commaLen = arr.length - 1;

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < commaLen) {
                System.out.printf("%d, ", arr[i]);
            } else {
                System.out.printf("%d", arr[i]);
            }
        }
        System.out.println("]");

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i < commaLen ? (arr[i] + ", ") : (arr[i]));
        }
        System.out.println("]");

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < commaLen) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");

        System.out.printf("[%d",arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.println("]");
    }
}


