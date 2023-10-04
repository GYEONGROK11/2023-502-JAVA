package com.green.Day5.Ch5;

import java.util.Scanner;

public class FlowEx18 {
    public static void main(String[] args) {
        //중첩 for문을 활용하여 구구단 2단~9단까지 출력
        /*
        2 x 1 =2

        ===
        9 x 9 =81
         */
        for (int i = 2; i <10 ; i++) {

            for (int j =1; j <10; j++) {
                System.out.printf("%d x %d = %d\n", i , j, i*j);

            }
            System.out.println();

        }
    }
}
