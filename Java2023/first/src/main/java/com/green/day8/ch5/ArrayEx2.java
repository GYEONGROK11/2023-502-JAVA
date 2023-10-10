package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        /*
        5개방의 정수형배열을 만들고 각방에 1~10의 랜덤값을 넣어주세요
         */
        final int LEN = 7;  //매직넘버
        int[] arr1 = new int[LEN];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) ((Math.random() * LEN) + 1);
            for (int z = 0; z < i; z++) {
                if (arr1[i] == arr1[z]) {
                    i--;
                    break;  // 없으면 반복문이 더 돈다 결과는 상관없음
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr[%d]:%d\t", i, arr1[i]);
        }
        System.out.println();

        System.out.println("--------");


        System.out.println(arr1);                      //주소값을 문자열로 바꾸어 표현해줌,toString 자동 변환
        System.out.println(arr1.toString());           //자동변환
        System.out.println(Arrays.toString(arr1));     //배열에 있는 값을 표현


        int[] arr2 = new int[LEN];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) ((Math.random() * LEN) + 1);

        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr[%d]:%d\t", i, arr2[i]);
        }
    }
}
