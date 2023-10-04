package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17_1 {
    public static void main(String[] args) {
        //스캐너이용 정수 *을 출력할라인의 수입력
        /*
        3입력시
        *
        **
        ***
        4
        *
        **
        ***
        ****
         */
        int i = 3;


        for (int z = 1; z <= i; z++) {

            System.out.print("*");
        }
        System.out.println();
    }
}
