package com.green.day4.ch4;

import java.util.Scanner;

public class If_3 {
    public static void main(String[] args) {
        //val 값이 홀수면 11은 홀수입니다
        //짝수면 10은 짝수입니다

        int val = (int)(Math.random() * 100) + 1; //1~100

        if (val % 2 == 0) {
            System.out.printf("%d는(은) %s입니다\n", val, "짝수");
        } else {
            System.out.printf("%d는(은) %s입니다\n", val, "홀수");
        }

        System.out.printf("%d는(은) %s수입니다\n", val, val % 2 == 0 ? "짝" :"홀");
    }
}