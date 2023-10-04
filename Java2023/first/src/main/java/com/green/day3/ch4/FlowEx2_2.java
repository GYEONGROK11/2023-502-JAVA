package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력해주세요 >>");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);


        if ( num  == 0) {
            System.out.printf("다른값을입력하세요" , num); }
        else {
            if (num % 2 == 0) {
                System.out.printf("%d은 짝수입니다", num);
            }
            if (num % 2 == 1) {
                System.out.printf("%d은 홀수입니다", num);
            }
        }
        /*
        숫자를 입력하세요 - 입력대기 - 입력
        변수에 해당 값이 저장될 수 있도록
        해당값이 홀수면
        00은 홀수입니다
        해당값이 짝수면
        00은 짝수입니다
         */
    }
}
