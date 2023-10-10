package com.green.day8.ch5;

import com.green.day7.ch5.Array;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        /*
        1. 정수 10개 저장배열을 생성
           0~9값을 순차적으로 대입
        2.    셔플
         */
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int rVal = (int) (Math.random() * arr.length);
            if (i == rVal) {
                continue;
            }
            int tmp = arr[i];
            arr[i] = arr[rVal];
            arr[rVal] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

