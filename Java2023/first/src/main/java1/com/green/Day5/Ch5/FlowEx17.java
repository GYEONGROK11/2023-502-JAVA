package com.green.Day5.Ch5;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        //scanner이용하여 정수를 입력 받는다.
        //"*을 출력할 라인의 수를 입력하세요>"
        //만약 3을 입력
        /*
        *
        * *
        * * *
         */

        Scanner star = new Scanner(System.in);
        System.out.println("*을 출력할 라인의 수를 입력 하세요");
        String num = star.nextLine();

        int tmp =Integer.parseInt(num);
        for (int i = 1; i<tmp ; i++) {
            for (int j =0; j<i;j++){ //(j<i+1)
                System.out.print("*");
            }
            System.out.println();// i=0, i=1 차이;


        }


        for (int i = 0; i<=tmp ; i++) {
            for (int j = 0; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();// i=0, i=1 차이;


        }
    }
}
