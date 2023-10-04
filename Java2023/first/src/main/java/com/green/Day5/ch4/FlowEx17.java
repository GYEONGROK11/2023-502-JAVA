package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        //스캐너이용 정수 *을 출력할라인의 수입력
        /*
        3입력시
        *
        **
        ***
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("*을 출력할 라인의 수를 입력하세요>>");
        int num = scan.nextInt();

        for (int i = 1; i <= num ; i++) {

            for (int z = 0; z < i; z++) {

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------");


        for (int i = 0; i < num ; i++) {

            for (int z = 0; z <= i; z++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
