package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력해주세요 >>");
        int num = scan.nextInt();
        //조건문 사용

        if ( num  == 0) {
            System.out.printf("다른값을입력하세요.\n" , num); }
        else {
            System.out.printf("%d(은)는 %s수입니다.\n",num,(num % 2 == 0 ? "짝" : "홀"));
        }


        if ( num  == 0) {
            System.out.print("다른값을입력하세요."); }
        else {
            if (num % 2 == 0) {
                System.out.printf("%d(은)는 짝수입니다.", num);
            }
            if (num % 2 == 1) {
                System.out.printf("%d(은)는 홀수입니다.", num);
            }
        }

    }
}
