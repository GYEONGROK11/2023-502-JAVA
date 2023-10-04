package com.green.day3.ch4;

import java.util.Scanner;

//해당값이 홀수면 -은 홀수입니다.
//해당값이 짝수면 -은 짝수입니다.
//예를 입력을 8로했다 8은 짝수입니다.
public class FlowEx2result {

    public static void main(String[] args) {
        System.out.printf("숫자를 하나 입력하세요");
        Scanner scan = new Scanner(System.in);

        int val = scan.nextInt();
        if(val == 0) {
            System.out.println("다른값을 입력해 주세요.");}
        else {
            if (val % 2 == 0) {
                System.out.printf("%d는 짝수 입니다.", val);

            }else System.out.printf("%d는 %d수입니다.");
        }
        }




}


