package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Mission {
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
            for (int z = num - i; z > 0; z--) {
                System.out.print("_");
            }
            for (int z = 0; z < i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------");

        for (int i = num; i > 0; i--) {
            for (int z = 1; z <= num; z++) {
                if (z < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("-----------");

        for (int i = num; i > 0; i--) {
            for (int z = 1; z <= num; z++) {
                System.out.print(z < i ? "_" : "*");
            }
            System.out.println();
        }
    }
}
