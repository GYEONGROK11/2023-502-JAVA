package com.green.day8.ch5;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 33, 91, 88, 100, 55, 95, 200, -100};
        //score 안에서  min값과 max값을 출력
        int i = 0;
        int MAX = score[0];
        int MIN = score[0];

        for (i = 1; i < score.length; i++) {
            if (MAX < score[i]) {
                MAX = score[i];
            }
            if (MIN > score[i]) {
                MIN = score[i];
            }
        }
        System.out.printf("MAX : %d\n", MAX);
        System.out.printf("MAX : %d\n", MIN);
    }
}


