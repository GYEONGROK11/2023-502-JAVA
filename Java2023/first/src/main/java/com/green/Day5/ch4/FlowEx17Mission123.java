package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Mission123 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("*을 출력할 라인의 수를 입력하세요>>");
        int num = scan.nextInt();
        /*
        4입력
        ___*
        __**
        _***
        ****
         */

        for (int i = 1; i <= num; i++) {
            for (int z = num-i ; z > 0; z--) {
                System.out.print("_");
            }
            for (int a = 0 ; a < i ; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
